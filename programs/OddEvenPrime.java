// Menu driven program to print n even, odd , and prime number

import java.io.*;

public class OddEvenPrime
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(i);

        short choice;
        int num;
        boolean flag = true;
        while(flag)
        {
            System.out.println("Choose one from following");
            System.out.println("0.EXIT");
            System.out.println("1.Check Even or Odd");
            System.out.println("2.Check Prime or Not");
            System.out.print("Enter your Choice: ");
            choice = Short.parseShort(read.readLine());

            switch(choice)
            {
                case 0:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                case 1:
                    System.out.print("Enter Number: ");
                    num = Integer.parseInt(read.readLine());
                    if(num % 2 == 0) System.out.println("Even Number");
                    else System.out.println("Odd Number");
                    break;
                case 2:
                    System.out.print("Enter Number: ");
                    num = Integer.parseInt(read.readLine());
                    if(prime(num) == true) System.out.println("Not Prime");
                    else System.out.println("Prime");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();
            System.out.println();
        }
        
    }
    
    
    public static boolean prime(int number)
    {
        if(number == 1) return true;
        else
        {
            for(int i=2; i<number; i++)
            {
                if(number % i == 0) return true;
            }
        }
        return false;
    }
}