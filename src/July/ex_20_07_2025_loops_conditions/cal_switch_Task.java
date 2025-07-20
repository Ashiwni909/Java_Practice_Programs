package July.ex_20_07_2025_loops_conditions;

import java.util.Scanner;

public class cal_switch_Task
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no1");
        int no1 = sc.nextInt();
        System.out.println("Enter the no2");
        int no2 = sc.nextInt();
        System.out.println("Enter the operator +,-,*,%");
        char operator = sc.next().charAt(0);

        switch (operator)
        {
            case '+':
                System.out.println(no1+no2);
                break;

            case '-':
                System.out.println(no1-no2);
                break;

            case '*':
                System.out.println(no1*no2);
                break;

            case '%':
                System.out.println(no1/no2);
                break;

            default:
                System.out.println("Enter valid input");
                break;

        }





    }
}
