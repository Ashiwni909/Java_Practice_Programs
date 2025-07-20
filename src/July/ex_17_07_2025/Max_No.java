package July.ex_17_07_2025;

public class Max_No
{
    public static void main(String[] args) {

        //Raugh logic
        //a>b->a is greater no else b is greater no

        int a = 100;
        int b = 200;
        int c = 30;

        int result = a > b ? a : b;
        System.out.println("Max no is "+result);

        //result= condition1?expresion1:(condition2?expresion2:expression3)
        //a>b->a
        //b>c->b
        //c>a->c

        int max_no_outof_3= a>b?a:(b>c?b:c);
        System.out.println("Max no out of three is " +max_no_outof_3);

        int max_no_3 = a>=b&&a>=c?a:(b>=c?b:c);
        System.out.println(max_no_3);

    }
}
