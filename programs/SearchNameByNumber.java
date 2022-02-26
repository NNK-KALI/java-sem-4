/*
    21)WAP to accept the roll number and name of the student,
    and search for name by the input as roll no
*/

import java.util.Scanner;

public class SearchNameByNumber
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        int rollNo[] = new int[10];
        String name[] = new String[10];

        for(int i=0; i<5; i++)
        {
            
            System.out.print("Enter roll no: " );
            rollNo[i] = read.nextInt();
            System.out.print("Enter name: " ) ;
            read.nextLine();
            name[i] = read.nextLine();
            System.out.println();
        }

        
        System.out.print("Enter student roll no: ");
        int key = read.nextInt();
        for(int i=0; i<rollNo.length; i++)
        {
            if(rollNo[i] == key)
            {
                System.out.println("Roll no " + key + " is " + name[i]);
                break;
            }
        }


    }
}