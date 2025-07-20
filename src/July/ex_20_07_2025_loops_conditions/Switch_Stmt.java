package July.ex_20_07_2025_loops_conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_Stmt
{
    public static void main(String[] args) {
        //if u have one stmt and multiple contions in that case you can use switch stmt
        //here we can use if else also but bit it bocome very complex for multiple condition handlings
        //also on if else we cant not use the break and continue keywords

        //switch stmt mainly used with byte,short,int,long(with its wrapper) enum and string

        //syntax
        //Switch(Expression)
        //{
        //case1:
        //break;
        //case2:
        //break;
        //Default;
        //}

        //take the user input from 1 to 7 and accourdinly say which day is

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no from 1 to 7");
        int no = sc.nextInt();

        switch (no)
        {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednusday");
                break;
            }
            case 4:{
                System.out.println("Thrusday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                break;
            }


        }

    }
}
