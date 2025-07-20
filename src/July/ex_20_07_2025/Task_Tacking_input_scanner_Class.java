package July.ex_20_07_2025;

import java.util.Scanner;

public class Task_Tacking_input_scanner_Class
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Name of person");
        String name = sc.next();
        System.out.println("Entered name is "+name);

       System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        System.out.println("Entered age of the person is" +age);

        System.out.println("Enter the salary of the person");
        float salary = sc.nextFloat();
        System.out.println("Entered salary is "+salary);

        sc.close();

    }
}
