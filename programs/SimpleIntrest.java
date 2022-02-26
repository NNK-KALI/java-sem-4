/*
write a program to find the difference between simple intrest and compound intrest when 
principal, rate and time is given
ci =  a - p and a=p*(1+r/100)t, si=p*r*t/100
*/

public class SimpleIntrest
{
    public static void main(String args[])
    {
        double p, r, t, power, a;
        double si, ci;
        t = 2;
        p = 500;
        r = 4;
        si = (p*r*t)/100;
        power = Math.pow(1+r/100, t);
        a = p * power;
        ci = a - p;
        System.out.println("Simple intrest: " + si);
        System.out.println("compound intrest: " + ci);
        System.out.println("Difference of ci and si is: " + (ci - si));
    }
}