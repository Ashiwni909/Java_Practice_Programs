package July.ex_20_07_2025;

public class Increment_Decrement
{
    public static void main(String[] args)
    {
        //Pre_increnet
        //++varible-> increment the value 1st then store
        //increment first then print

        int a=10;//-> Here currently value of a is 10
        int b= ++a;//-> Here now value of a become 11 and stored in b

        System.out.println(a);
        System.out.println(b);

        //Post_increment
        //variable++-> print first then increment

        int x =20; //here currently value of x is 20
        int y = x++; //Here value of x is 21
        System.out.println(x);
        System.out.println(y);

    }
}
