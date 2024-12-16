package inheritancePractice1;

public class Rectangle extends Shape{

    @Override
    int getArea(){

        return side1 * side2;
    }
}
