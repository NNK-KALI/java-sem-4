/*
    23)WAP to find the sum of the numbers  of left diagonal and sum of the 
    numbers  of right diagonal of a matrix
*/

import java.util.Scanner;

public class SumOfDiagonalElements
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int m = read.nextInt();
        
        System.out.print("Enter no of columns: ");
        int n = read.nextInt();
        
        if(m != n)
        {
            System.out.println("Cloumns and rows should be equal");
            return;
        }
        int arr[][] = new int[m][n];

        System.out.println("Enter array elements ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print("A [" + i + "][" + j + "] ");
                arr[i][j] = read.nextInt();
            }
        }
        System.out.println();
        System.out.println("Original Matix");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int LeftDiagonalSum = 0;
        int RightDiagonalSum = 0;

        int k = n-1;
        for(int i=0; i<n; i++,k--)
        {
            LeftDiagonalSum += arr[i][i];
            RightDiagonalSum += arr[i][k];
        }

        System.out.println(LeftDiagonalSum);
        System.out.println(RightDiagonalSum);
        
        
    }
}