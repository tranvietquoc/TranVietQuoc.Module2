package ss6_kethua.circle_cylinder;

public class Circle {
    private double radius = 3.0;
    private String color = "Green";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = " + getRadius() + " Color is: " + getColor() + " Area is " + getArea() + " Perimeter is " + getPerimeter();
    }
}
