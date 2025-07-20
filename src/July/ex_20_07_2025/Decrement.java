package July.ex_20_07_2025;

public class Decrement
{
    public static void main(String[] args)
    {
        int b= 10;
        System.out.println(b--);//print 1st
        System.out.println(b);//then decrement

        System.out.println(--b);//decrement 1st
        System.out.println(b);//then print


        int c =20;
        System.out.println(--c + ++c + c--);
       // --c= 19
        // c=19
        //c=20
        //++C=20
        //c--=20
        //c=19

        System.out.println(c);


    }
}
