import classes.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("New Person");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        Person person1 = new Person(name,age);
        person1.showInfo();
        scan.nextLine(); //buffer cleaning.
        System.out.println("-----------------------------------------------------");
        System.out.println("New Student");
        System.out.print("Enter name: ");
        name = scan.nextLine();
        System.out.print("Enter age: ");
        age = scan.nextInt();

        System.out.print("Enter student ID: ");
        int studentID = scan.nextInt();
        scan.nextLine(); //buffer cleaning.
        System.out.print("Enter student major: ");
        String major = scan.nextLine();

        Student student1 = new Student(name,age,studentID,major);
        student1.showInfo();
    }
}