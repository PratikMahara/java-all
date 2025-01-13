import java.util.*;

class NegativeAmountException extends Exception {
  NegativeAmountException() {
    System.out.println("Invalid amount entered. Please enter a positive number.");
  }
}

interface IDefault { // Use camelCase for interface names
  void deposit(float amount) throws NegativeAmountException; // Specify arguments and exceptions
  void withdraw(float amount) throws NegativeAmountException, InsufficientFundsException; // Add InsufficientFundsException
}

public class Bank implements IDefault {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float balance = 1000;
    System.out.println("You have ₹" + balance + " in your bank account.");

    while (true) { // Loop for continuous transactions
      System.out.println("\nEnter the amount: ");

      // Validate user input for a number
      float amount;
      while (!sc.hasNextFloat()) {
        System.out.println("Invalid input. Please enter a number: ");
        sc.next(); // Clear invalid input
      }
      amount = sc.nextFloat();

      System.out.println("Press 1 for deposit || Press 2 for withdrawal || Press 0 to exit");
      int choice = sc.nextInt();

      if (choice == 0) {
        break; // Exit loop on choice 0
      }

      try {
        if (choice == 1) {
          deposit(amount, balance);
        } else if (choice == 2) {
          withdraw(amount, balance);
        } else {
          System.out.println("Invalid choice. Please try again.");
        }
      } catch (NegativeAmountException | InsufficientFundsException e) {
        System.out.println(e.getMessage()); // Use exception message
      }
    }
  }

  @Override // Mark method implementation
  public void deposit(float amount, float balance) throws NegativeAmountException {
    if (amount < 0) {
      throw new NegativeAmountException();
    } else {
      balance += amount;
      System.out.println("Depositing ₹" + amount + ". New balance: ₹" + balance);
    }
  }

  @Override
  public void withdraw(float amount, float balance) throws NegativeAmountException, InsufficientFundsException {
    if (amount < 0) {
      throw new NegativeAmountException();
    } else if (amount > balance) {
      throw new InsufficientFundsException("Insufficient funds. Available balance: ₹" + balance);
    } else {
      balance -= amount;
      System.out.println("Withdrawing ₹" + amount + ". New balance: ₹" + balance);
    }
  }
}

class InsufficientFundsException extends Exception {
  InsufficientFundsException(String message) {
    super(message);
  }
}
