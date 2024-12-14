package classes;

public class Worker extends Person{
    //instance fields.
    int workerID;
    String position;

    //constructor.

    public Worker(String name, int age, int workerID, String position) {
        super(name, age);
        this.workerID = workerID;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker { name: "+ name +", age: "+ age +", workerID: "+workerID+", position: "+position+"}";
    }

    @Override
    public void showStatus() {
        System.out.printf("%s is currently working at %s",this.name,this.position);
    }
}
