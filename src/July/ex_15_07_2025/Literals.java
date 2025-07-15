package July.ex_15_07_2025;

public class Literals
{
    public static void main(String[] args)
    {
        //Char literals
        char c ='A';
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r ='\r';//deletes previous word

        System.out.println("Ashiwni"+new_line+"Hosmani");
        System.out.println("Ashiwni"+tab_line+"Hosmani");
        System.out.println("Ashiwni"+back_space+"Hosmani");
        System.out.println("Ashwini"+car_r+"Hosmani");

        //Integer Literals
        int a =10;
        int marks = -20;
        System.out.println(marks);
        System.out.println(a);

        //Boolean Literals
        boolean result=true;
        boolean result1=false;

        System.out.println("A result is "+result);
        System.out.println("B result is"+result1);

        //Non primitive data type null Literal is applicable only for string

        String str = null;

    }
}
