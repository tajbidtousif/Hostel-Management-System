import java.util.ArrayList;
import java.util.Scanner;


// ********* This Student  class have a parameterized method called register which is getting student information input from user ***********

public class Student {

    public int batch;
    public String id, name;

    public void register(ArrayList< Student > stu_list) {

        Scanner input = new Scanner(System.in);
     
        System.out.printf("Enter Your Name: ");
        name = input.nextLine();
        System.out.printf("Enter Your ID: ");
        id = input.nextLine();
        System.out.printf("Enter Your Batch: ");
        batch = input.nextInt();
        input.nextLine();

        stu_list.add(this);

    }

    public void showInfo() 
    {
        System.out.printf(name + " " + id + " " + batch + "\n");
    }

}

