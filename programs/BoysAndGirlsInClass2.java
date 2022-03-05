/*
27) WAP in java to find out which row the more girl are sitting and which row the boys are more and the 
    boys and girls row should not match (in the same way find out in which row they are equally sitting
    and which rows the boys are greater than girls, automatically the other rows girls are more than boys)
*/


public class BoysAndGirlsInClass2
{
    public static void main(String[] args) 
    {
        
        int arr[][] = 
        {
            {0, 1, 1, 0, 0, 1},
            {1, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1}
        };
        
        int rowsWithMoreBoys[] = new int[5];
        int rowsWithMoreGirls[] = new int[5];
        int rowsWithEqualBoysAndGirls[] = new int[5];
        int k,l,m;
        k = l = m = 0;
        
       
        for(int i=0; i<5; i++)
        {
            int boysCount = 0; // 0's as boys
            int girlsCount = 0; // 1's as girls
            for(int j=0; j<6; j++)
            {
                if(arr[i][j] == 0)
                {
                    boysCount++;
                }
                else
                {
                    girlsCount++;
                }
            }
            
            if(boysCount == girlsCount)
            {
                rowsWithEqualBoysAndGirls[k] = i;
                rowsWithEqualBoysAndGirls[k]++;
                k++;
            }
            else if(boysCount > girlsCount)
            {
                rowsWithMoreBoys[l] = i;
                rowsWithMoreBoys[l]++;
                l++;
            }
            else
            {
                rowsWithMoreGirls[m] = i;
                rowsWithMoreGirls[m]++;
                m++;
            }
        }
        System.out.print("Rows with equal no of boys and girls : ");
        for(int i=0; i<k; i++)
        {
            System.out.print(rowsWithEqualBoysAndGirls[i] + " ");
        }
        System.out.println();
        System.out.print("Rows with more no of boys : ");
        for(int i=0; i<l; i++)
        {
            System.out.print(rowsWithMoreBoys[i] + " ");
        }
        System.out.println();
        System.out.print("Rows with more no of girls : ");
        for(int i=0; i<m; i++)
        {
            System.out.print(rowsWithMoreGirls[i] + " ");
        }
        System.out.println();
    }
    
}
