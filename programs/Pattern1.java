/* 13

*    *
**  **
******
**  **
*    *

*/

public class Pattern1
{
    public static void main(String args[])
    {
        int a,b;
        a = 1; b = 6;
        for(int i=1; i<=5; i++)
        {
            if(i<=3)
            {  
                for(int j=1; j<=6; j++)
                {
                    if(j<=a || j>=b)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                a++; b--;
            }
            else
            {
                a++; b--;
                for(int j=1; j<=6; j++)
                {
                    if(j<=b || j>=a)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                
            }
            
            System.out.println();
        }

    }
}