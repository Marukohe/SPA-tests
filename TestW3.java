public class TestW3 {
    void UndefCond() {
        int a = 1;
        int b = 0;
        int z;
        int undef = a / b;
        if(undef > 0) {
            z = 1;
        }
        else {
            z = 2;
        }
        use(z);
    }

    void use(int n) {

    }
}