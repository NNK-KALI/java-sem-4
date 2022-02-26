/*
A library charges a fine for books returned late
first five days - Rs. 2/-
six to ten days - Rs. 4/-
Above ten days - Rs. 6/-
WAP to calculate the fine assuming that a book is returned n days late.
*/

import java.io.*;

public class LibraryFine
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(i);

        System.out.println("Enter no of days: ");
        int n = Integer.parseInt(read.readLine());

        if(n <= 5)
        {
            System.out.println("Fine = " + (n*2));
        }
        else if(n <= 10)
        {
            System.out.println("Fine = " + (((n-5) * 4) + 10));
        }
        else
        {
            System.out.println("Fine = " + ((5*4) + (5*2) + ((n-10) * 6)));
        }
    }
}