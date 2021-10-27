public class TestA {
    public static void main(String[] args) {
        int a = getNum("Hello, World");
        int b = multiReturns(a);
        b = addOne(b);
    }

    static int getNum(String str) {
        return str.length();
    }

    static int multiReturns(int result) {
        switch (result) {
            case 0 : return 0;
            case 1 : return 1;
            default: return 2;
        }
    }

    static int addOne(int num) {
        return num + 1;
    }
}