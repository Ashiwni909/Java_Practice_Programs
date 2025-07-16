package July.ex_16_07_2025;

public class Type_Casting_Eg
{
    public static void main(String[] args)
    {
        long phone_no= 9090909090l;
        //if user want to store this in short then implicity its not possible we can do this with explicitly only

        //short s= phone_no->not possible by jvm
        short s1= (short) phone_no;//valid->Expicitly done by user
        System.out.println(phone_no);
        //here in explicit type casting we can loss the data

        //GST=14.18
        int course = 9000;
        float GST = 14.18f;

        int total = course+(int)GST;
        //here we loss the .18 amount
        System.out.println(total);






    }
}
