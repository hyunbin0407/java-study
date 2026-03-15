package Day08;

public class MethodReturn1 {

    static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
