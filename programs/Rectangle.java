/*
write a program to find the area, perimeter, diagonal of a rectangle
*/

public class Rectangle
{
    public static void main(String args[])
    {
        int length, breath;
        int area, perimeter;
        double diagonal;

        length = 2; breath = 4;
        area = perimeter = 0;
        diagonal = 0.0;

        area = length * breath;
        perimeter = 2*(length + breath);
        
        diagonal = Math.sqrt((length*length)+(breath*breath));

        System.out.println("Area :" + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + (float)diagonal);

    }
}