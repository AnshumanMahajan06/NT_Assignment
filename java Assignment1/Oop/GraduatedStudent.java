package Oop;

import java.util.Objects;

class Student {
    int rollNo;
    String Sname;
    double marks;

    public Student() {
    }

    public Student(int rollNo, String Sname, double marks) {
        this.rollNo = rollNo;
        this.Sname = Sname;
        this.marks = marks;
    }
    public void displayInfo() {
        System.out.println("Name: " + Sname);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }

}

public class GraduatedStudent extends Student {
    boolean placed;
    String companyName;

    public GraduatedStudent() {
    }

    public GraduatedStudent(boolean placed, String companyName) {
        this.placed = placed;
        this.companyName = companyName;
    }

    public void displayInfo(String message) {
        System.out.println(message);
        super.displayInfo();  // Call parent method to reuse code
        System.out.println("Placement Status: " + placed);
        System.out.println("Placed in Company: " + companyName);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Anshuman",89.3);
            s1.displayInfo();
            GraduatedStudent g1=new GraduatedStudent(true,"NucleusTeq");
            g1.displayInfo();
    }

}
