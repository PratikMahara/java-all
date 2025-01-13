package assignment2;

import java.util.Scanner;

public class Threadassignment {
    public static void main(String[] args) {
        number n1 = new number();
        name n2 = new name();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range: ");
        n1.n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Student's name: ");
        n2.n = scan.nextLine();
        scan.close();
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        t1.start();
        t2.start();
    }
}

class number implements Runnable{
    int n;
    public void run(){
        for(int i = 0 ; i < n ; i++){
            System.out.println(i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
        }
    }
}
class name implements Runnable{
    String n;
    public void run(){
        for(int i = 0 ; i < n.length() ; i++){
            System.out.println(n.charAt(i));
        }
    }
}