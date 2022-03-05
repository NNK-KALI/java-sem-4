/*
    25) WAP to find how many vowels are there in a given statement
*/


import java.util.Scanner;

public class Vowels
{
    public static void  main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        char vowels[] = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        System.out.print("Enter statement: ");
        String str = scan.nextLine();
        scan.close();
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            for(int j=0; j<vowels.length; j++)
            {
                if(str.charAt(i) == vowels[j])
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println("No of vowels = " + count);
    }
}
