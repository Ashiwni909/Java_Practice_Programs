package July.ex_20_07_2025_loops_conditions;

import java.util.Scanner;

public class Grade_Calculator_if_else
{
    //90-100->A
    //80-89->B
    //70-79->C
    //60-69->D
    //0-59->F
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks will let know the grade");
        int marks = sc.nextInt();
        if(marks>=90)
        {
            System.out.println("A Grage");
        }
        else if(marks>=80&&marks<=89)
        {
            System.out.println("B Grage");
        } else if (marks>=70&&marks<=79)
        {
            System.out.println("C Grade");
        }
        else if (marks>=60&&marks<=69)
        {
            System.out.println("D Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }

}
