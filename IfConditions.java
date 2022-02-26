public class IfConditions
{
    public static void main(String args[])
    {
        int num1, num2, num3;
        num1 = 40; num2 = 10; num3 = 2;
        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is Greatest");
        }
        else if(num2 > num3)
        {
            System.out.println(num2 + " is Greatest");
        }
        else
        {
            System.out.println(num3 + " is Greatest");
        }
    }
}