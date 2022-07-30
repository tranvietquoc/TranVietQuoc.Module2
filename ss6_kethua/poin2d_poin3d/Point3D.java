package ss6_kethua.poin2d_poin3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){
    }

    public Point3D(float z,float x,float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getX();
        super.getY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xy = super.getXY();
        float[] xyz = {xy[0], xy[1], z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D {" +
                "x=" + super.getX()+
                ", y=" + super.getY()+
                ", z=" + z +
                '}';
    }
}
