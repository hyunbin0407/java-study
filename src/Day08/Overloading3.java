package Day08;

public class Overloading3 {
    static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
