

public class savingaccount {
    static float rate = 12.2f;

    String account_no;
    String name;
    float balance;

    savingaccount(String a, String b, float c)
    {
        name = b;
        account_no = a;
        balance = c;
    }

    static void modify(float a)
    {
        rate = a;
    }

    public float calculate(float t)
    {
        return (balance*t*rate)/100;
    }
}