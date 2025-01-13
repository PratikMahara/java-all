import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String to check whether it is palindrome or not");
        String str = obj.nextLine();
        int j = str.length() - 1;
        int i;

        for (i = 0; i < str.length(); i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("It is not a palindrome");
                return;
            }
        }

        System.out.println("The string " + str + " is a palindrome");
    }
}
