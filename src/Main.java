import java.util.ArrayList;
import java.util.Scanner;

//*************************  Main Method **************************** */

public class Main {

    public static ArrayList<Student> boy;
    public static ArrayList<Student> girl;
    
    public static void main(String[] args) {

        boy =  new ArrayList<Student>();
        girl = new ArrayList<Student>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter YOur Name: ");
        String name = input.next();
        System.out.println("Welcome, "+name);
        menu();
        

    }
