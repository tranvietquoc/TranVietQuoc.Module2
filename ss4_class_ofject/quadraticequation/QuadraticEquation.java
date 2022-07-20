package ss4_class_ofject.quadraticequation;

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

}
