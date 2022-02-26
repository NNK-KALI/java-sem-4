/*
 20) wap considering the below matrix as class room where boys and girls are seated in a row
    1 1 0 0 1 0
    0 1 1 1 1 1
    0 0 1 1 0 0
    0 0 0 1 1 1
 You need to find which rows are having equal number of boys(0's) and girls(1's)
*/

public class BoysAndGirlsInClass
{
    public static void main(String args[])
    {
        int arr[][] = {
            {1, 1, 0, 0, 1, 0},
            {0, 1, 1, 1, 1, 1},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1},
        };

        for(int i=0; i<4; i++) 
        {
            int boys = 0;
            int girls = 0;
            for(int j=0; j<6; j++) 
            {
                if( boys <= 3 && girls <= 3)
                {
                    if(arr[i][j] == 0) boys++;
                    else girls++;
                }
                else
                {
                    break;
                }
            }
            if(boys == girls)
            {
                System.out.println(i);
            }
        }

    }
}