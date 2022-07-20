package ss5_accessmodifier;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: "+student.getName() + "\n" + "Classes: "+ student.getClasses());
    }
}
