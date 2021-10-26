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

    // ************************* Main Menubar of Management System ****************************
    

    public static void menu() {

        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\t\tWelcome To Hostel Management System");
        System.out.println("\t\t\t\t\t------------------------------------");
        System.out.println("1. Registration");
        System.out.println("2. Food Circle");
        System.out.println("3. Emergency Doctor Services");
        System.out.println("4. Safety");
        System.out.println("5. Registered Members List");

        System.out.print("\nEnter the number of your choice: ");

        int choice = input.nextInt();
        input.nextLine();
        
        // ************************* Main Menubar selecing by user of Management System ****************************


        if (choice == 1) {
            registration();

        }

        else if (choice == 2) {
            foodCircle();

            if(goBack())
                    menu();

        }

else if (choice == 3) {

            emergencyDoctorServices();

            if(goBack())
                    menu();
        }

        else if (choice == 4) {
            
            securityPanel();

            if(goBack())
                    menu();

        }

        else if (choice == 5) {

            System.out.print("1. Boys Registured List\n");
            System.out.print("2. Girls Registured List\n");
            System.out.print("Enter the number of your choice: ");

            int gender = input.nextInt();
            input.nextLine();

            if (gender == 1) {

                showDetails(boy);

               
            }

            else if (gender == 2) {
                showDetails(girl);
               
            } 
        }
        

        if(goBack()) {
            menu();
        }
    }

       // ************************* Registration Part **************************** */

    public static void registration() {

        Scanner input = new Scanner(System.in);

        System.out.print("1. Boys" + " (" + (100 - boy.size()) + " seats available)\n");
        System.out.print("2. Girls" + " (" + (100 - girl.size()) + " seats available)\n");
 
        System.out.print("Enter the number of your choice: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) 
        {
            int availableSeats = 100 - boy.size();
            if (availableSeats == 0) 
            {
                System.out.println("Sorry, No Seat Available for Boys!");
            }

            else
             {
                Student st = new Student();
                st.register(boy);

                System.out.println("\nSuccessfully Registured!\n");

                if(goBack())
                    menu();
            }
        }


        else if (choice == 2)
         {
            int availableSeats = 100 - girl.size();
            if (availableSeats == 0) {
                System.out.println("Sorry, No Seat Available for Girls");
            } else {
                Student st = new Student();
                st.register(girl);

                System.out.println("\nSuccessfully Registured!\n");

                if(goBack())
                    menu();
            }

        }
        

    }
    
    // ************************* This Method showing Students List by using Foreach Loop ****************************

    public static void showDetails(ArrayList<Student> list) {

        for (Student student : list) {

            student.showInfo();
        }

    }

     // *********************** Emergency Doctor Services Method **************************

    public static void emergencyDoctorServices() {
        System.out.println("\t\t\t\t\tEmergency Doctor Services");
        System.out.println("\t\t\t\t\t--------------------------");

        System.out.print(" Saturday , Sunday and Monday: \n\n");
        System.out.print("  Dr.Hezbulla jibon \n");
        System.out.print("  Time : 2 p.m - 5 p.m\n");
        System.out.print("  Medicine specialist \n");
        System.out.print(" mobile : 014******* \n\n\n");
        System.out.print(" Tuesdasy , Wednesday and Trusday: \n\n");
        System.out.print(" Dr.Shishir Boshak \n");
        System.out.print(" Time : 2 p.m - 5 p.m\n");
        System.out.print(" Medicine specialist \n");
        System.out.print(" mobile : 017******** \n\n\n");

        System.out.print(" Friday \n");
        System.out.print(" Dr, N.K Sinha \n");
        System.out.print(" Time : 2 p.m - 5 p.m\n");
        System.out.print(" ENT specialist\n");
        System.out.print(" mobile : 017******** \n\n\n");

    } 
