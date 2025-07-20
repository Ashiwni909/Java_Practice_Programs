package July.ex_20_07_2025_loops_conditions;

import java.util.Scanner;

public class Tasl_Triabgle
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st side of triangle");
        int side_1 = sc.nextInt();
        System.out.println("Enter the 2nd side of triange");
        int side_2=sc.nextInt();
        System.out.println("Enter the 3rd side of triange");
        int side_3 = sc.nextInt();

        if (side_1 == side_2 && side_2== side_3 && side_3==side_1)
        {
            System.out.println("Equilatral Triange");
        }
        else if (side_1 == side_2 || side_2 == side_3 || side_3 == side_1 )
        {
            System.out.println("Iscoscales Triange");
        }
        else
        {
            System.out.println("Scalene Triange");
        }


    }
}
