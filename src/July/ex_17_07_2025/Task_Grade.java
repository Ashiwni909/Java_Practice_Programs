package July.ex_17_07_2025;

public class Task_Grade
{
    public static void main(String[] args)
    {
        //Nested Ternary
        // result = condition1?expresstion1:(condition2?expresion2:expression3)

        //if score is 90 or above->A grade
        //if score 80-89->B grade
        //if score 70-79-> C grade
        //if score 60-69-> D grade
        //if score < 60-> F grade

        int score = 85;

        String grade = (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

        System.out.println("My grade is "+grade);

        System.out.printf("My grade is %s",grade);

    }
}
