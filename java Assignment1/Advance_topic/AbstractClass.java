package Advance_topic;

abstract class School {

    abstract void schoolInfo(String sname, String city, String medium);

}

class Student extends School {

    String sname;
    String city;
    String medium;

   
    void schoolInfo(String sname, String city, String medium) {
        sname = this.sname;
        city = this.city;
        medium = this.medium;
    }

 
}

public class AbstractClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolInfo("Seva Sadan", "Burhanpur", "English");
      
    }
}
