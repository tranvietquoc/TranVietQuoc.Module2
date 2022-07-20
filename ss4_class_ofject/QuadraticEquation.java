package ss4_class_ofject;

import java.util.Scanner;

public class QuadraticEquation {
    public double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b*b - 4 * a * c;
    }
    public double  getRoot1() {
        return (-b + Math.pow(getDiscriminant(),0.5))/2*a;
    }
    public double  getRoot2() {
        return (-b - Math.pow(getDiscriminant(),0.5))/2*a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter number c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("QuadraticEquation has two Root: x1 = %.6f, x2 = %.6f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.printf("QuadraticEquation has one Root: x = %.6f", quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        }
    }
}
