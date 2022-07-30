package ss6_kethua.circle_cylinder;

public class Main {    public static void main(String[] args) {
    Circle circle = new Circle();
    System.out.println(circle);

    Cylinder cylinder = new Cylinder();
    System.out.println(cylinder);
    System.out.println("Volume: "+cylinder.getVolume());
}
}
