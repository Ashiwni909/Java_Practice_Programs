package July.ex_16_07_2025;

public class Operators
{
    public static void main(String[] args) {
        int a = 10;//(assignment operator)
        int b =30;

        //Arithmatic Operators

        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;

        System.out.println("Addition is"+c);
        System.out.println("substraction is"+d);
        System.out.println("Multiplication is"+e);
        System.out.println("Division is"+f);
        System.out.println("Modulus is"+g);

        //Relational operator->Answer alaways in true or false
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        //Unary operator
        int y=90;
        int z = -90;
        System.out.println(y);
        System.out.println(z);
        System.out.println(z+90);

        //+ operator behaves differently with different data type
        //in int it behaves like addition and in String it behaves like concatination
        //This behaviour is called as operator overloading
        String s=  "Ashiwni";
        String s1= "Hosmani";
        System.out.println(s+s1);
        System.out.println(a+b);


        //intrview question
        String first_name = "Ashiwni";
        String last_name="Hosmani";
        System.out.println(first_name+last_name+a+b);
        //here 1st concatination will happen then arithmatic operation

        System.out.println(a+b+first_name+last_name);
        //here 1st arithmatic operation will happen then concatination

        System.out.println(first_name+last_name+(a+b));

        //Binary operator
        System.out.println(true||false);
        boolean a3 = true;
        System.out.println(!a3);
        System.out.println(!!a3);
        System.out.println(!!!a3);
        System.out.println(!!!!a3);

        //new operator
        String name = new String("Ashwini");
        //new->new memory or object in heap area

        //Instance of operator
        System.out.println(name instanceof String);





    }
}
