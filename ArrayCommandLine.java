public class ArrayCommandLine
{
    public static void main(String args[])
    {
        int j = 0;

        int integerSum = 0;
        for(int i=0; i<5; i++)
        {
            integerSum += Integer.parseInt(args[j]);
            j++;
        }
        System.out.println("Integer sum = " + integerSum);

        float floatSum = 0.00f;
        for(int i=0; i<5; i++)
        {
            floatSum += Float.parseFloat(args[j]);
            j++;
        }
        System.out.println("Float sum = " + floatSum);

        System.out.print("charcters = ");
        for(int i=0; i<5; i++)
        {
            System.out.print(" " + args[j]);
            j++;
        }

        System.out.print("\nStrings = ");
        for(int i=0; i<5; i++)
        {
            System.out.print(" "+ args[j]);
            j++;
        }
        System.out.println();




    }
}