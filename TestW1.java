interface I {
    int get();
}

public class TestW1 {
    public static void main(String[] args) {
        I obj1 = new B();
        int num1 = obj1.get();
        I obj2 = new E();
        int num2 = obj2.get();
        I obj3 = new C();
        int num3 = obj3.get();
        int ans = use(num1, num2, num3);
        use2(ans);
    }

    public static int use(int x, int y, int z) {
        int t = x + y;
        int s = t + z;
        return s;
    }

    public static void use2(int num) {

    }
}

interface II extends I{
    int get();
}

interface III extends I{
    int get();
}

class A implements I{
    public int get() {return 1;}
}

class E implements II{
    public int get() {return 1;}
}

class D extends E{
    public int get() {return 1;}
}

class F extends E{
    public int get() {return 1;}
}

class B extends A{
    public int get() {return 1;}
}

class C extends B{
    public int get() {return 1;}
}