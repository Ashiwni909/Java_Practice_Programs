package July.ex_15_07_2025;

public class Constant_Final_Keyword
{
    public static void main(String[] args) {
        final float pi = 3.14F;
        final int a =10;
        final String str = "Ashwini";
        final double d = 110.890;
        final int age;
        age =90;
       // age=88;-> not possible to reassign as its final

        //now this value cant be change in program execution after so many lines of code also

        System.out.printf("Constant value for pi is %f",pi);
        System.out.println();
        System.out.println("Constant valuve for pi is"+pi);

        System.out.println("Age is "+age);

    }
}
