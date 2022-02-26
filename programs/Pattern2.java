/* 14)

   *        
  * *       
 * * *      
* * * *
 * * *
  * *
   *

*/

public class Pattern2
{
    public  static void main(String args[])
    {
        int x = 4;
        int first, last;
        first = x;
        last = x;
        for(int i=0; i<7; i++)
        {
            for(int j=1; j<=7; j++)
            {
                if(i<x)
                {
                    if(j>= first && j <= last)
                    {
                        if(i%2 == 0)
                        {
                            if(j%2 == 0)
                            {
                                System.out.print(j);
                            }
                            else
                            {
                                System.out.print(" ");
                            }
                        }
                        else
                        {
                            if(j%2 != 0)
                            {
                                System.out.print(j);
                            }
                            else
                            {
                                System.out.print(" ");
                            }
                        }
                    }
                    else
                    {
                        System.out.print(" ");
                    }

                }
                else
                {
                    if(j>=first && j <=last)
                    {
                        if(i%2 == 0)
                        {
                            if(j%2 == 0)
                            {
                                System.out.print(j);
                            }
                            else
                            {
                                System.out.print(" ");
                            }
                        }
                        else
                        {
                            if(j%2 != 0)
                            {
                                System.out.print(j);
                            }
                            else
                            {
                                System.out.print(" ");
                            }
                        }
                    }
                    else
                    {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
            if(i<3) 
            {
                first--; last++;
            }
            else
            {
                first++; last--;    
            }
        }
    }

}