public class Main {

    //metodo sum.
    static int sumar(int num1, int num2){
        return num1 + num2;
    }

    static int sumar(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    static double sumar(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    //main method.
    public static void main(String[] args) {

        System.out.println(sumar(1,2));
        System.out.println(sumar(1,2,3));
        System.out.println(sumar(1.0,2.0,3.0));
    }
}