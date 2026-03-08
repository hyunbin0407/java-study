package Day02;

public class Operator2 {
    static void main() {
        // 비교연산자 	==, !=, >, <, >=, <=
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을
        boolean result = a == b;
        System.out.println(result);
    }
}
