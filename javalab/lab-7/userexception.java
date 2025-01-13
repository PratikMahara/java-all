import java.util.*;
class NegativeNumberException extends Exception
{
	public NegativeNumberException()
	{
		System.out.print("Negative number found");
		}
	}
public class userexception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive numbers to sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            checksum(a, b);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void checksum(int a, int b) throws NegativeNumberException {
        if (a < 0||b < 0) {
            throw new NegativeNumberException();
        }
        int c = a + b;
        System.out.println("The sum is: " + c);
    }
}
