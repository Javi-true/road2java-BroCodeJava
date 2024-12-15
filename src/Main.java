import classes.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    //instance fields.
    static boolean continueProgram = true;
    static boolean bufferDirty = false;
    static int optionMainMenu;
    static int optionPrintCategory;
    static int optionPrintType;
    static int indexPrint;

    //method main menu.
    public static int mainMenu(){
        Scanner scanOptionMain = new Scanner(System.in);
        int selectedOption = 0;
        System.out.println("Welcome to the personal system!");
        System.out.println("---------------------------------");
        System.out.println("Which action would you like to do?");
        System.out.println("1. Add personal.");
        System.out.println("2. Consult personal");
        System.out.println("---------------------------------");
        System.out.print("Select option: ");

        selectedOption = scanOptionMain.nextInt();
        //scanOptionMain.close();
        return selectedOption;
    }

    public static int addMenu(){
        Scanner scanOptionAdd = new Scanner(System.in);
        int selectedOption = 0;
        System.out.println("---------------------------------");
        System.out.println("Which kind of personal would you like to add?");
        System.out.println("1. Person");
        System.out.println("2. Student");
        System.out.println("3. Professor");
        System.out.println("4. Worker");
        System.out.println("---------------------------------");
        System.out.print("Select option: ");

        selectedOption = scanOptionAdd.nextInt();
        //scanOptionAdd.close();
        return selectedOption;

    }

    public static void askContinue(){
        Scanner scanOptionContinue = new Scanner(System.in);
        int selectedOption = 0;
        System.out.println("---------------------------------");
        System.out.println("Would you like to do another movement?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("---------------------------------");
        System.out.print("Select option: ");
        selectedOption = scanOptionContinue.nextInt();

        if(selectedOption == 1){
            optionMainMenu = mainMenu();
        }else {
            continueProgram = false;
        }
    }

    //public static void printMenu(){}

    public static void main(String[] args){
        //Declaration of all variables.
        String name, major, speciallityArea, position;
        int age, studentID, professorID, workerID;

        //int optionMainMenu;
        int optionAddMenu;


        //instancing Scanner.
        Scanner scan = new Scanner(System.in);

        //creating array.
        ArrayList<Person>[] arrayPersonal= new ArrayList[4];

        //creating arrayList inside of array.
        for (int i=0;i < 4;i++){
            arrayPersonal[i] = new ArrayList<>();
        }

        optionMainMenu = mainMenu();

        do{

            if(optionMainMenu == 1){

                optionAddMenu = addMenu();
                switch (optionAddMenu){
                    case 1:
                        if(bufferDirty){
                            scan.nextLine();
                        }
                        System.out.println("Please fill the next fields: ");
                        System.out.print("Name: ");
                        name = scan.nextLine();
                        System.out.print("Age: ");
                        age = scan.nextInt();

                        bufferDirty = true;

                        arrayPersonal[0].add(new Person(name, age));
                        askContinue();
                        break;
                    case 2:
                        if(bufferDirty){
                            scan.nextLine();
                        }
                        System.out.println("Please fill the next fields: ");
                        System.out.print("Name: ");
                        name = scan.nextLine();
                        System.out.print("Age: ");
                        age = scan.nextInt();
                        System.out.print("Student ID: ");
                        studentID = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Major: ");
                        major = scan.nextLine();

                        bufferDirty = false;

                        arrayPersonal[1].add(new Student(name, age, studentID, major));
                        askContinue();
                        break;
                    case 3:
                        if(bufferDirty){
                            scan.nextLine();
                        }
                        System.out.println("Please fill the next fields: ");
                        System.out.print("Name: ");
                        name = scan.nextLine();
                        System.out.print("Age: ");
                        age = scan.nextInt();
                        System.out.print("Professor ID: ");
                        professorID = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Specialty Area: ");
                        speciallityArea = scan.nextLine();

                        bufferDirty = false;

                        arrayPersonal[2].add(new Professor(name, age, professorID, speciallityArea));
                        askContinue();
                        break;
                    case 4:
                        if(bufferDirty){
                            scan.nextLine();
                        }
                        System.out.println("Please fill the next fields: ");
                        System.out.print("Name: ");
                        name = scan.nextLine();
                        System.out.print("Age: ");
                        age = scan.nextInt();
                        System.out.print("Worker ID: ");
                        workerID = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Position: ");
                        position = scan.nextLine();

                        bufferDirty = false;

                        arrayPersonal[3].add(new Worker(name, age, workerID, position));
                        askContinue();
                        break;
                }

            }else if(optionMainMenu == 2){

                if(!arrayPersonal[0].isEmpty()){
                    System.out.println(arrayPersonal[0].size()+" Persons are registered.");
                }
                if(!arrayPersonal[1].isEmpty()){
                    System.out.println(arrayPersonal[1].size()+" Students are registered.");
                }
                if(!arrayPersonal[2].isEmpty()){
                    System.out.println(arrayPersonal[2].size()+" Professors are registered.");
                }
                if(!arrayPersonal[3].isEmpty()){
                    System.out.println(arrayPersonal[3].size()+" Workers are registered.");
                }

                //test.
                Scanner scanOptionPrint = new Scanner(System.in);
                System.out.println("Which category do you want to consult?");
                System.out.println("1. Person");
                System.out.println("2. Student");
                System.out.println("3. Professor");
                System.out.println("4. Worker");
                System.out.println("---------------------------------");
                System.out.print("Select option: ");
                optionPrintCategory = scanOptionPrint.nextInt();
                System.out.println("Consult by index or bulk?");
                System.out.println("1. Index");
                System.out.println("2. Bulk");
                System.out.println("---------------------------------");
                System.out.print("Select option: ");
                optionPrintType = scanOptionPrint.nextInt();

                if(optionPrintType == 1){
                    System.out.print("Enter the index of the element you want to show: ");
                    indexPrint = scanOptionPrint.nextInt();

                    switch (optionPrintCategory){
                        case 1:
                            System.out.println(arrayPersonal[0].get(indexPrint));
                            break;
                        case 2:
                            System.out.println(arrayPersonal[1].get(indexPrint));
                            break;
                        case 3:
                            System.out.println(arrayPersonal[2].get(indexPrint));
                            break;
                        case 4:
                            System.out.println(arrayPersonal[3].get(indexPrint));
                            break;
                    }
                }else{
                    switch (optionPrintCategory){
                        case 1:
                            System.out.println(arrayPersonal[0]);
                            break;
                        case 2:
                            System.out.println(arrayPersonal[1]);
                            break;
                        case 3:
                            System.out.println(arrayPersonal[2]);
                            break;
                        case 4:
                            System.out.println(arrayPersonal[3]);
                            break;
                    }
                }

                askContinue();
            }

        }while (continueProgram);

        System.out.println("Program ended. Thank you for preferring us!");


    }
}