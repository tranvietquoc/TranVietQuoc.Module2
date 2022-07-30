package ss7_abstract_interface.colorable;

public class Square extends Shape implements Colorable {
    boolean colorable = false;
    double side;
    Square(){
    }

    Square(double side){
        this.side=side;
    }

    Square(boolean color, double side){
        this.colorable=color;
        this.side=side;
    }



    public void howToColor() {
        if(this.colorable) System.out.println("Color all four side!");
    }

    public double area(){
        return side*side;
    }


    public String toString() {
        return "This Square's area is: "+area()+". ";
    }
}
