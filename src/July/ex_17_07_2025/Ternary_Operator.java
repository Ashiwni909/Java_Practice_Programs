package July.ex_17_07_2025;

public class Ternary_Operator
{
    public static void main(String[] args)
    {
        //result = condition?expression1:expression2

        int no =-5;
        String result= no>0?"Positive":"Negative";
        System.out.println(result);

        int age = 20;
        System.out.println(age>=18?"Allowed to vote":"Not alloed to vote");

        if (age>=18)
        {
            System.out.println("I am able to vote");
        }
        else
        {
            System.out.println("Dont have voting ride");
        }

    }
}
