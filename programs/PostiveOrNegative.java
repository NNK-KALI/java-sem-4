/*
    6)WAP to accept three numbers (positive or negative). if  they are unequal then display the greatest number otherwise, 
display they are equal. the program should also display whether the given numbers are 'all positive', 'all negative' or 
'the combination of prositive and negative'.
*/


import java.io.*;

public class PostiveOrNegative
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(i);

        int num1, num2, num3;
        System.out.println("Enter three numbers: ");
        num1 = Integer.parseInt(read.readLine());
        num2 = Integer.parseInt(read.readLine());
        num3 = Integer.parseInt(read.readLine());


        if(num1 == num2 && num2 == num3)
        {
            System.out.println("All are Equal.");
        }
        else
        {  
            if(num1 > num2 && num1 > num3) System.out.println(num1);
            else if(num2 > num3) System.out.println(num2);
            else System.out.println(num3);
        }



        if((num1 > 0) && (num2 > 0) && (num3 > 0))
        {
            System.out.println("All are postive");
        }
        else if((num1 < 0) && (num2 < 0) && (num3 < 0))
        {
            System.out.println("All are negative");
        }
        else
        {
            System.out.println("Combination of postive and negative numbers");
        }
        
    }
}