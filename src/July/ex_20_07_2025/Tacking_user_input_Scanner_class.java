package July.ex_20_07_2025;

import java.util.Scanner;

public class Tacking_user_input_Scanner_class
{
    public static void main(String[] args)
    {
        //Tacking input by using scanner class

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person age ");
        int age = sc.nextInt();

        System.out.println(age>=18?"Person is allowed to go Goa":"Person is not allowed to go Goa");

    }
}
