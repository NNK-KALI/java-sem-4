// 12 Calculate the GPS and CGPA that particular student has gained

import java.io.*;


class Students
{
    int id;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;
    static int sub1Credits = 2;
    static int sub2Credits = 3;
    static int sub3Credits = 4;
    static int sub4Credits = 5;
    static int sub5Credits = 6;

    InputStreamReader inp = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(inp);

    public void getInput() throws IOException
    {
        System.out.print("Enter Student id: ");
        id = Integer.parseInt(read.readLine());
        System.out.println("Enter five subject marks ");
        sub1 = Integer.parseInt(read.readLine());
        sub2 = Integer.parseInt(read.readLine());
        sub3 = Integer.parseInt(read.readLine());
        sub4 = Integer.parseInt(read.readLine());
        sub5 = Integer.parseInt(read.readLine());

    }

    public int findGradePoint(int marks)
    {
        if(marks > 89) return 10;
        else if(marks > 79) return 9;
        else if(marks > 69) return 8;
        else if(marks > 59) return 7;
        else if(marks > 49) return 6;
        else if(marks > 44) return 5;
        else if(marks >= 40)return 4;
        else return 0;
    }

    public float gpa(int sub1, int sub2, int sub3, int sub4, int sub5)
    {
        
        return (((sub1Credits*findGradePoint(sub1)) + (sub2Credits*findGradePoint(sub2)) + (sub3Credits*findGradePoint(sub3)) +
                (sub4Credits*findGradePoint(sub4)) + (sub5Credits*findGradePoint(sub5))) /
                 (float)(sub1Credits + sub2Credits +sub3Credits + sub4Credits +sub5Credits)) ;
    }
}
public class GpaAndCgpa
{
    public static void main(String args[]) throws IOException
    {
        
        Students s1 = new Students();
        s1.getInput();

        Students s2 = new Students();
        s2.getInput();

        float sem1Gpa = s1.gpa(s1.sub1, s1.sub2, s1.sub3, s1.sub4, s1.sub5);
        float sem2Gpa = s2.gpa(s2.sub1, s2.sub2, s2.sub3, s2.sub4, s2.sub5);

        System.out.println("SEM1 GPA: " + sem1Gpa);
        System.out.println("SEM2 GPA: " + sem2Gpa);
        System.out.println("CGPA: " + (sem1Gpa + sem2Gpa)/ (2));


    }
}