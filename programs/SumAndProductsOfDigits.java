/*
    7)Read a two digit number, and WAP to add the sum of the digits to the product of the digits, and the resultant value should be 
equal to  the given number
*/

import java.io.*;

public class SumAndProductsOfDigits
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(i);

        System.out.println("Enter number: ");
        int number1 = Integer.parseInt(read.readLine());

        if(!(number1 > 9 && number1 < 100))
        {
            System.out.println("Invalid Range");
            return;
        }
        
        int sumOfDigits = 0;
        int productOfDigits = 1;

        int temp = number1;
        while(temp > 0)
        {
            int rem = temp % 10;
            sumOfDigits += rem;
            productOfDigits *= rem;
            temp /= 10;
        }

        // System.out.println(sumOfDigits + "  " + productOfDigits);
        if(number1 == sumOfDigits + productOfDigits)
        {
            System.out.println("Conditions satisified");
        }
        else
        {
            System.out.println("Conditions are not satisified");
        }
    }
}