/*
    A retailer offers 10% discount on the price of a Digital Camera. A customer has to pay 6% sales tax on the remaining amount.
    Write a program to calculate the amount to be paid by the customer, taking the retail price as an input.
*/

public class DiscountOnCamera
{
    public static void main(String args[])
    {
        double retailPrice = 75000;
        double priceAfterDiscount = retailPrice - (retailPrice * 0.1);
        double salesTax = priceAfterDiscount * 0.06;
        System.out.println("Final Amount : " + (priceAfterDiscount + salesTax));
        
    }
}