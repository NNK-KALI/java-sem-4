/*
Write a program to accept three different single digit numbers between 1 and 9. 
Display the greatest and smallest three digit number (example: I/P is 2, 7, 4 and O/P is 247) using if condition.
*/

import java.io.*;


public class SmallestAndGreatest
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inp);

        System.out.println("Enter three numbers ");
        short num1 = Short.parseShort(read.readLine());
        short num2 = Short.parseShort(read.readLine());
        short num3 = Short.parseShort(read.readLine());

        if((num1 > 0 && num1 < 10) && (num2 > 0 && num2 < 10) && (num3 > 0 && num3 < 10))
        {
            if(num1 > num2 && num1 > num3)
            {
                if(num2 > num3)
                {
                    System.out.println("Smallest digit: " + num3+num2+num1);
                    System.out.println("Greatest digit: " + num1+num2+num3);
                }
                else
                {
                    System.out.println("Smallest digit: " + num2+num3+num1);
                    System.out.println("Greatest digit: " + num1+num3+num2);
                }
            }
            else if(num2 > num3)
            {
                if(num1 > num3)
                {
                    System.out.println("Smallest digit: " + num3+num1+num2);
                    System.out.println("Greatest digit: " + num2+num1+num3);
                }
                else
                {
                    System.out.println("Smallest digit: " + num1+num3+num2);
                    System.out.println("Greatest digit: " + num2+num3+num1);
                }
            }
            else
            {
                if(num1 > num2)
                {
                    System.out.println("Smallest digit: " + num2+num1+num3);
                    System.out.println("Greatest digit: " + num3+num1+num2);
                }
                else
                {
                    System.out.println("Smallest digit: " + num1+num2+num3);
                    System.out.println("Greatest digit: " + num3+num2+num1);
                }
            }
        }
        else
        {
            System.out.println("Invalid range");
        }
    }
}