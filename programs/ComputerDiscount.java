/*
A computer manufacturing company anounces a special offer to heir customers
on purchasing laptops and th printers accordingly
on laptop: Discount = 15%
on printer = Discount = 10%
wap to calciculate the discount if a coustomer buys a laptop and a printer
*/

public class ComputerDiscount
{
    public static void main(String args[])
    {
        float laptopPrice = 30000;
        float printerPrice = 10000;

        int laptopQuantity, printerQuantity;
        laptopQuantity = printerQuantity = 1;

        float laptopDiscount, printerDiscount;
        laptopDiscount = 0.15f; printerDiscount = 0.1f;

        float finalLaptopsPrice, finalPrinterPrice;
        finalLaptopsPrice = laptopPrice * laptopDiscount * laptopQuantity; //4500
        finalPrinterPrice = printerPrice * printerDiscount * printerQuantity; //1000

        float totalDiscount;
        totalDiscount = finalLaptopsPrice + finalPrinterPrice;
        

        System.out.println("Total discount: " + totalDiscount);
       


    }
}