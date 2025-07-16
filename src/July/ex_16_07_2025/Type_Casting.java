package July.ex_16_07_2025;

public class Type_Casting
{
    //Widening->Converting smaller data tye to larger
    byte b =10;
    int a=b;//valid->(implicit casting this is done by JVM)
    int a1= (int)b;//valid->(This is called as explict casting this is done by jvm)
    //Above 2 are same statements

    //This casting can be done with the similar type eg, numeric

    //Narrowing->Converting large data type to small
    int z =900;
    //byte z1=z;//Invalid->Implicit JVM;
    byte z2=(byte)z;//Valid-> Explicitly done by user



}
