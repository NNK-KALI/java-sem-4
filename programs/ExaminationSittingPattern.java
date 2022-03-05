/*
    28) WAP in java using arrays to arrange the students in the examination hall in given format, i.e 
    we should arrange one first year student and one third year student in one bench (like for example
    0 represent first year students and 1 represent third year student)
    Row1    Row2   Row3
    1 0      1 0    1 0 
    0 1      0 1    0 1
    1 0      1 0    1 0
    Input (Take the input at run time )
    1) Take input of how many row are there in the class room (for example 3 rows in the above example)
    2) Take the input of how many benches in each row (total of 9 benches)
   
    Process and output
    3) Now arrange the students in those benches   
    4) Find out total of how many first year and how many third students fit in that class room
*/


import java.util.Scanner;

public class ExaminationSittingPattern
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int noOfRows = 0;
        System.out.print("Enter no of Rows: ");
        noOfRows = scan.nextInt();

        int rows[] = new int[noOfRows];
        int max = 0;
        for(int i=0; i<noOfRows; i++)
        {
            System.out.print("Enter no of benches in row - " + i + " = ");
            int temp = scan.nextInt();
            rows[i] = temp;
            if(temp > max) max = temp;
        }
        scan.close();

        for(int i=0; i<max; i++)
        {
            for(int j=0; j<noOfRows; j++)
            {
                if(i < rows[j])
                {
                    if(i%2==0) System.out.print("10  ");
                    else System.out.print("01  ");
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        int benchesCount = 0;
        for(int k: rows) benchesCount += k;
        
        System.out.println();
        System.out.println("No of first year students: " + benchesCount);
        System.out.println("No of third year students: " + benchesCount);

    }
}