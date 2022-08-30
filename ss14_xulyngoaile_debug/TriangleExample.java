package ss14_xulyngoaile_debug;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài 3 cạnh tam giác: ");
        System.out.print("Cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Cạnh c: ");
        double c = scanner.nextDouble();
        while (true) {
            try {
                if (checkTriangle(a, b, c))
                    break;
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                System.out.println();
                System.out.print("Cạnh a: ");
                a = scanner.nextDouble();
                System.out.print("Cạnh b: ");
                b = scanner.nextDouble();
                System.out.print("Cạnh c: ");
                c = scanner.nextDouble();
            } finally {
                System.out.println("Nhập 3 cạnh tam giác hợp lệ.");
            }
        }
    }

    public static boolean checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalTriangleException("Vui lòng nhập a, b, c >0. Nhập lại: ");
        else if (a + b < c)
            throw new IllegalTriangleException("Vui lòng nhập a + b < c. Nhập lại: ");
        else if (a + c < b)
            throw new IllegalTriangleException("Vui lòng nhập a + c < b. Nhập lại: ");
        else if (b + c < a)
            throw new IllegalTriangleException("Vui lòng nhập b + c < a. Nhập lại: ");
        return true;
    }
}
