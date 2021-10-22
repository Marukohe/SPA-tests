public class TestW2 {
    int IterationAndIf() {
        int x = 2;
        int z;
        while(x != 0) {
            if(x == 2) {
                z = 114514;
            }
            else {
                z = 1919810;
            }
            x--;
        }
        return z;
    }

    int UnreachableFunc() {
        int a = 1;
        int b = 2;
        int z;
        if(a < b) {
            z = use1();
        }
        else {
            z = use2();
        }
        z = 233;
        return z;
        z = use3();
    }

    int use1() {
        return 1;
    }

    int use2() {
        return 2;
    }

    int use3() {
        return 3;
    }
}