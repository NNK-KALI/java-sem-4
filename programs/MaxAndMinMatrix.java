/*
    18)WAP to find the Max and Min Element from the given matric
*/

import java.util.Scanner;

public class MaxAndMinMatrix
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter no of rows ");
        int m = read.nextInt();
        System.out.println("Enter no of columns ");
        int n = read.nextInt();

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
        System.out.println();

        int minElement = arr[0][0];
        int maxElement = arr[0][0];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                minElement = Math.min(minElement, arr[i][j]);
                maxElement = Math.max(maxElement, arr[i][j]);
            }
        }

        System.out.println("minimum element is " + minElement);
        System.out.println("maximum element is " + maxElement);
    }
}