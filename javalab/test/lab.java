class addition {
    int c;
    int d;

    addition(int a, int b) {
        c = a;
        d = b;
    }

    void add() {

        int e = c + d;
        System.out.println("the addition is " + e);
    }
}

class multi extends addition {
    multi(int a, int b) {
        super(a, b);
    }

    void multiplication() {
        int mul = c * d;
        System.out.println("the multiplication is " + mul);
    }
}

class sub extends addition {
    sub(int a, int b) {
        super(a, b);
    }

    void subtraction() {
        int s = c - d;
        System.out.println("the subtraction is " + s);
    }
}

public class lab {
    public static void main(String[] args) {
        multi m = new multi(5, 3);
        m.add();
        m.multiplication();

        sub s = new sub(10, 7);
        s.add();
        s.subtraction();
    }
}
