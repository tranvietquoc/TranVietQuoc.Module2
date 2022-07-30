package ss6_kethua.poin2d_poin3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = {this.x, this.y};
        return xy;
    }

    @Override
    public String toString() {
        return "Poin2D {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
