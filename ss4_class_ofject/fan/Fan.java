package ss4_class_ofject.fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    public int speed = SLOW;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        if (on) {
            return "Color: " + this.color +"\nRadius: "+ this.radius +"\nSpeed: " + this.speed + "\nFan is on ";
        } else {
            return "Color: " + this.color +"\nRadius: "+ this.radius +"\nSpeed: " + this.speed + "\nFan is off ";
        }
    }
}
