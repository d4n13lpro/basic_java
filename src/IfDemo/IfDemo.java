package IfDemo;

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b)
            System.out.printf("a es menor que b: a = %d, b = %d%n", a, b);

        if (a == b)
            System.out.printf("a es igual que b: a = %d, b = %d%n", a, b);

        System.out.println();

        c = a - b;
        System.out.printf("c contiene: %d%n",c);
        if (c >= 0) System.out.println("c no es negativo");
        if (c < 0) System.out.println("c es negativo");

        c = b - a;
        System.out.printf("c contiene: %d%n",c);

        if (c >= 0) System.out.println("c no es negativo");
        if (c < 0 ) System.out.println("c es negativo");
    }
}
