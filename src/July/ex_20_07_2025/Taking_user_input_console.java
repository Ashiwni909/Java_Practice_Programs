package July.ex_20_07_2025;

public class Taking_user_input_console
{
    public static void main(String[] args)
    {
        //check whether A person is allowed to Goa or not
        //if age>=18->Drinking allowed he allowed to go for goa
        //if age<=18->Drinking not allowed he is not allowed to go goa

        /*int person_A_age = 20;

        String result = (person_A_age>=18?"Allowed to go for Goa":"Not allowed to go for Goa");
        System.out.println(result);/*

        //here we have gived hard coded age field here we need to take the input from user

        //1. BY passing console arguments
        //2. By using Scanner class
        //3. By using BufferReader class

        1st way by passing console arguments
         *
         */

        int age = Integer.parseInt(args[0]);
        System.out.println(age>=18?"Allowed to Goa":"Not allowed to Goa");



    }
}
