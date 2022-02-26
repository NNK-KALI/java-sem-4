/*
 Mr. X accumulates 3000 shares of a company. He already had shares of that company valuing  Rs. 10 nominal value, 
 which yield 10% dividend per annum and received Rs. 2000 as dividend at the end of the year.
 Write a program to calculate the number of shares he has and how many more shares to be purchased to make the target 
 [number of shares = (annual dividend *100)/(nominal value * div%)]
*/

public class Shares
{
    public static void main(String args[])
    {
        double annualDividend = 2000;
        double nominalValue = 10;
        double shares = (annualDividend * 100.0) / (nominalValue * 10.0);
        System.out.println("No of shares: " + shares);
        System.out.println("No of shares required: " + (3000.0 - shares));
    }
}