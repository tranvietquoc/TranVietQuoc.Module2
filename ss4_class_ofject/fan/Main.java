package ss4_class_ofject.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setColor("Blue");
        fan2.setRadius(5);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(false);

        System.out.println(fan1);
        System.out.println();
        System.out.println(fan2);
    }
}

