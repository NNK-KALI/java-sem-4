/*
    26) WAP to find how many words are there in a given statement
*/


import java.util.Scanner;

public class NoOfWordsInAStatement
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the statement: ");
        String str = read.nextLine().trim();
        read.close();
        int count = 0;
        
        // str = str.replaceAll("\\s+", " ");  using regex
        // for(int i=0; i<str.length(); i++)
        // {
        //     if(str.charAt(i) == 32)
        //     {count++;}
        // }
        
        for(int i=0; i<str.length(); i++)
        {
        	if(str.charAt(i) == 32 && str.charAt(i+1) != 32)
        	{
        		count++;
        	}
        }
        count++;
        System.out.println("No of words = " + count);
    }
}