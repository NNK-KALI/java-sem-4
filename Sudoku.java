public class Sudoku 
{

	public static boolean rowAndColumnCheck(int arr[][])
	{
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				int temp = arr[i][j];
				for(int k=0; k<9; k++)
				{
					
					if(i==k || j==k)
					{
						continue;
					}
					else if(arr[i][k] == temp || arr[k][j] == temp)
					{
						return false;						
					}
				}
			}
		}
		return true;
	}
	
	public static void display(int arr[][])
	{
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(arr[i][j] + " ");
				if((j+1) % 3 == 0)
					System.out.print(" | ");
			}
			System.out.println();
			if((i+1) % 3 == 0)
				System.out.println("--------------------------");
		}
	}
	
	public static boolean squareCheck(int arr[][], int x, int y)
	{
		for(int i=x; i<x+3; i++)
		{
			for(int j=y; j<y+3; j++)
			{
				
				int temp = arr[i][j];
				for(int k=x; k<x+3; k++)
				{
					for(int l=y; l<y+3; l++)
					{
						if(k==i && l==j)
						{
							continue;
						}
						else if(arr[k][l] == temp)
						{					
							return false;	
						}
					}
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		boolean flag = true;
		
		int arr[][] = 
			{
					{5, 8, 1, 6, 7, 2, 4, 3, 9},
					{7, 9, 2, 8, 4, 3, 6, 5, 1},
					{3, 6, 4, 5, 9, 1, 7, 8, 2},
					{4, 3, 8, 9, 5, 7, 2, 1, 6},
					{2, 5, 6, 1, 8, 4, 9, 7, 3},
					{1, 7, 9, 3, 2, 6, 8, 4, 5},
					{8, 4, 5, 2, 1, 9, 3, 6, 7},
					{9, 1, 3, 7, 6, 8, 5, 2, 4},
					{6, 2, 7, 4, 3, 5, 1, 9, 8},
			};
		
		display(arr);
		
		for(int i=0; i<9; i+=3)
		{
			for(int j=0; j<9; j+=3)
			{
				if(!squareCheck(arr, i, j))
				{
					flag = false;
					break;
				}
			}
		}
		
		if(!rowAndColumnCheck(arr))
			flag = false;

		System.out.println("All conditions satisified: " + flag);		
	}

}
