import java.util.Scanner;

public class common {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1st number: ");
        int a = scan.nextInt();
        System.out.println("Enter your 2nd number: ");
        int b = scan.nextInt();

        while (a > 0) {
            int c = a % 10;
            int d = b;

            while (d > 0) {
                int e = d % 10;

                if (c == e) {
                    System.out.println(c + " is common");
                    break;
                }

                d = d / 10;
            }

            a = a / 10;
        }

        scan.close();
    }
}