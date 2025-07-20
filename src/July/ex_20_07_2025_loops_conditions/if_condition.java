package July.ex_20_07_2025_loops_conditions;

import java.util.Scanner;

public class if_condition
{
    public static void main(String[] args)
    {
        //Take user input for age and check whether is allowed to vote or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te age of person");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("You are allowed to vote");
        }
        else
        {
            System.out.println("You are not alloed to vote");
        }



    }
}
