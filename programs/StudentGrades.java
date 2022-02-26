/*
The grades are assigned to student based on the average they have gained. WAP to accpet the marks from user 
calculate the average and display their grades
90% and above O 
80 - 89  A+ 
70 - 79  A 
60 - 69 B+
50 - 59 B
45 - 49 C
40 - 44 P
<40     F
*/

import java.io.*;

public class StudentGrades
{
    public static void main(String args[]) throws IOException
    {

        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inp);
        int sub1, sub2, sub3, sub4, sub5, total;

        int avg;

        System.out.println("Enter 5 subjects marks");
        sub2 = Integer.parseInt(read.readLine());
        sub1 = Integer.parseInt(read.readLine());
        sub3 = Integer.parseInt(read.readLine());
        sub4 = Integer.parseInt(read.readLine());
        sub5 = Integer.parseInt(read.readLine());

        total = (sub1 + sub2 + sub3 + sub4 + sub5);
        avg = total/5;

        System.out.println();
        System.out.print("Grade : ");
        if(avg > 89) System.out.println("O");
        else if(avg > 79) System.out.println("A+");
        else if(avg > 69) System.out.println("A");
        else if(avg > 59) System.out.println("B+");
        else if(avg > 49) System.out.println("B");
        else if(avg > 44) System.out.println("C");
        else if(avg >= 40) System.out.println("P");
        else System.out.println("F");
    }
}