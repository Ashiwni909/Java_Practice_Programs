package July.ex_20_07_2025_loops_conditions;

import java.util.Scanner;

public class even_odd_pgm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();
        if(no%2==0)
        {
            System.out.println("Entered no is even no"+no);
        }
        else
        {
            System.out.println("Entered no is odd no"+no);
        }


    }
}
