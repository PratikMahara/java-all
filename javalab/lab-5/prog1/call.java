import java.util.*;
public class call {
    public static void main(String [] args)
    {
      Scanner obj=new Scanner(System.in);
      int r=obj.nextInt();
      obj.nextLine();
      String c=obj.nextLine();

      kittian obj1=new kittian(r,c);

      student obj2=new student(r,c);
      obj1.hostel();

    }
}
