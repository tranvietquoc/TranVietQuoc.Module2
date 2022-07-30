package ss6_kethua.point_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println();

        point = new Point(2,3);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint =new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);

        moveablePoint.setSpeed(3,5);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
