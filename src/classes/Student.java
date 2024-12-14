package classes;

public class Student extends Person{
    //instance fields for student.
    int studentID;
    String major;

    //constructor.--------------------------------------------------
    public Student(String name,int age,int studentID, String major){
        super(name, age);
        this.studentID = studentID;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student { name: "+ name +", age: "+ age +", studentID: "+studentID+", major: "+major+"}";
    }


    @Override
    public void showStatus() {
        System.out.printf("%s is currently studying %s",this.name,this.major);
    }

}
