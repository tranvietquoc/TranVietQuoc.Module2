package ss5_accessmodifier;

public class Circle {
    private double radius = 1.0;
    private final String color = "Red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
