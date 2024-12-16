//1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called
// Cat that overrides the makeSound() method to bark.

//3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called
// Rectangle that overrides the getArea() method to calculate the area of a rectangle.
package inheritancePractice1;

public class MainInheritance {

    public static void main(String[] args){

        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();

        System.out.println(shape.getArea());
        System.out.println(rectangle.getArea());

    }
}
