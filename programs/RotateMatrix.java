/*
    16) WAP to rotate the given matrix
    Ex: 
    10 20 30
    40 50 60
    70 80 90
    OUTPUT:
    30 60 90
    20 50 80
    10 40 70
*/



import java.util.Scanner;

public class RotateMatrix
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int m = read.nextInt();
        
        System.out.print("Enter no of columns: ");
        int n = read.nextInt();
        
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
        System.out.println("Rotated matrix ");
        for(int i=n-1; i>=0; i--)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[j][i] + " ");
                
            }System.out.println();
        }
    }
}