import classes.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.close();
        Person person1 = new Person(name,age);

        person1.showInfo();
    }
}