package ss4_class_ofject.fan;

public class Fan {
    public int Slow = 1;
    public int Medium = 2;
    public int Fast = 3;
    private int speed = Slow;

    private boolean on = false;

    private double radius = 5;

    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    // (boolean()? true "": false "")
    public String toString() {
        return (isOn()? "Color: "+getColor()+", Radius: "+ getRadius()+", Speed: "+getSpeed()+", fan is on":"Color: "+getColor()+", Radius: "+getRadius()+", fan is off")                  ;
    }
}
