

public class stat{
    public static void main(String args[])
    {
        savingaccount person1 = new savingaccount("Pratik","22054103",5921.50f);

        System.out.println("Interest = " + person1.calculate(3));

        savingaccount.modify(8);

        System.out.println("Interest = " + person1.calculate(3));
    }
}