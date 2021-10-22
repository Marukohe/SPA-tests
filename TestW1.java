public class TestW1 {
    public static void main(String[] args) {

    }

    public static int nestIf() {
        int a = 1;
        int b = 0;
        int z;
        if(a >= b) {
            if(b <= a) {
                z = 1;
            }
            z = 0;
        }
        else {
            if(b <= a) {
                z = 1;
            }
            z = 0;
        }
        return z;
    }

}