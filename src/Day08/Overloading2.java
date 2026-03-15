package Day08;

public class Overloading2 {

    static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 1);
    }

    static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
