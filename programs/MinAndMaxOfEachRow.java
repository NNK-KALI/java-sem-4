/*
 19) wap to find the max and min of each row in the given matrix and store 
 them in two different arrays
*/

import java.util.*;

public class MinAndMaxOfEachRow
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter no of rows ");
        int m = read.nextInt();
        System.out.println("Enter no of columns ");
        int n = read.nextInt();

        int arr[][] = new int[m][n];
        int minArr[] = new int[m];
        int maxArr[] = new int[m];
 
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

        
        for(int i=0; i<m; i++)
        {
            int minElement = arr[i][0];
            int maxElement = arr[i][0];

            for(int j=0; j<n; j++)
            {
                minElement = Math.min(minElement, arr[i][j]);
                maxElement = Math.max(maxElement, arr[i][j]);
                
            }
            minArr[i] = minElement;
            maxArr[i] = maxElement;
        }

        System.out.print("minimum elements of each row:");
        for(int i=0; i<m; i++) System.out.print(" " + minArr[i]);
        System.out.println();

        System.out.print("maximum elements of each row:");
        for(int i=0; i<m; i++) System.out.print(" " + maxArr[i]);
        System.out.println();
    }
}