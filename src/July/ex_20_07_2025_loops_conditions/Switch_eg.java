package July.ex_20_07_2025_loops_conditions;

import java.util.Locale;
import java.util.Scanner;

public class Switch_eg
{
    public static void main(String[] args)
    {
        //Web automation
        //take user input for entering the browser name
        //according to name exe that code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser_name = sc.next();
        browser_name = browser_name.toLowerCase();


        switch (browser_name)
        {
            case "firefox_browser":
                System.out.println("Execute the firfox code");
                break;

            case "chrome":
                System.out.println("Execute the chrome code");
                break;

            case "edge":
                System.out.println("Execute the edge code");
                break;

            default:
                System.out.println("Enter valid input");
                break;

        }

    }
}
