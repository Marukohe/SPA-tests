public class TestA {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        switch(a) {
            case 0 : b = 100;
            case 1 : b = 200;
            case 2 : b = 300; break;
            default: b = 400;
        }
        testNAC(b);
    }

    public static int testNAC(int b) {
        switch(b) {
            case 100: return 1;
            case 200: return 2;
            default: return 0;
        }
    }
}