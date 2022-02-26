/*
    24) wap to consider a square matrix and find whether the given matrix 
    is symmentric matrix or not 
*/

import  java.util.Scanner;

public class SymmetricMatrix
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter no of rows ");
        int m = read.nextInt();
        System.out.println("Enter no of columns ");
        int n = read.nextInt();

        if(m != n)
        {
            System.out.println("Columns and rows should be equal");
            return;
        }

        int arr[][] = new int[m][n];

        System.out.println("Enter array elements ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("A [" + i + "][" + j + "] ");
                arr[i][j] = read.nextInt();
            }
        }
        System.out.println();

        System.out.println("Original Matrix ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<i; j++ )
            {
                if(arr[i][j] != arr[j][i])
                {
                    System.out.println("Not symmentric");
                    return;
                }
            }
            
        }

        System.out.println("Symmetric Matrix");
    }
}