package classes;

public class Professor extends Person{
    //instance fields.
    int professorID;
    String speciallityArea;

    //constructor.

    public Professor(String name, int age, int professorID, String speciallityArea) {
        super(name, age);
        this.professorID = professorID;
        this.speciallityArea = speciallityArea;
    }

    @Override
    public String toString() {
        return "Professor { name: "+ name +", age: "+ age +", professorID: "+professorID+", speciallityArea: "+speciallityArea+"}";
    }

    @Override
    public void showStatus() {
        System.out.printf("%s is currently teaching %s",this.name,this.speciallityArea);
    }
}
