package ss5_accessmodifier.student;

import ss5_accessmodifier.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: "+student.getName() + "\n" + "Classes: "+ student.getClasses());
    }
}
