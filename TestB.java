public class TestB {
    public static void main(String[] args) {
        int a = 1;
        if(a >= 1) {
            a = minusOne(a);
        }
        int b = getNAC(a);
    }

    static int minusOne(int a) {
        return a - 1;
    }

    static int getNAC(int a) {
        return a;
    }
}