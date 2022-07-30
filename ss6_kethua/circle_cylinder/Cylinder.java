package ss6_kethua.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, int radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*Math.pow(super.getRadius(),2)*2*height;
    }

    @Override
    public String toString() {
        return "Cylinder: " +
                " Volume= " + getVolume() +
                ", Height= " + height +
                ", Radius= " + super.getRadius()+
                ", Color= " + super.getColor();
    }
}
