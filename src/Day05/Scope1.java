package Day05;

public class Scope1 {

    static void main() {
        // Scope = 변수나 객체가 접근 가능한 범위
        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
        //System.out.println("main x = " + x);
        System.out.println("main m = " + m);

    }
}
