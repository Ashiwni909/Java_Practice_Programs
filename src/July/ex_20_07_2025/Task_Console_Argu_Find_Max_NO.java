package July.ex_20_07_2025;

public class Task_Console_Argu_Find_Max_NO
{
    public static void main(String[] args)
    {
        int no_1 = Integer.parseInt(args[0]);
        int no_2 = Integer.parseInt(args[1]);
        int no_3 = Integer.parseInt(args[2]);
        System.out.println(Integer.parseInt(args[0]));
        System.out.println(Integer.parseInt(args[1]));
        System.out.println(Integer.parseInt(args[2]));

        System.out.println(no_1>=no_2&&no_2>=no_3?"no_1 is max":no_2>no_3?"no_2 is max":"no_3 is max");

    }
}
