package classes;

public class Person {
    //instance fields.
    String name;
    int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //toString.
    public String toString(){
        return "Person { name: "+ name +", age: "+ age +"}";
    }

    //Method to show info.
    public void showInfo(){
        System.out.printf("%s's info: \n", this.name);
        System.out.println(this);
    }

    //Method to show status.
    public void showStatus(){
        System.out.println("This is just a person");
    }
}
