import java.util.Scanner;

public class ArrayOperations
{
    public static void main(String args[])
    {
        
        int size;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter array size: ");
        size = read.nextInt();

        int[] arr = new int[10];

        System.out.println("Enter Array elements: ");
        for(int i=0; i<size; i++) arr[i] = read.nextInt();

        System.out.print("Array Elements are: ");
        {
            for(int i=0; i<size; i++) System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        boolean flag = false;
        while(!flag)
        {
            System.out.println("0) TO EXIT");
            System.out.println("1) Insert");
            System.out.println("2) Delete");
            System.out.println("3) Update");
            System.out.print("Enter your choice: ");
            int choice = read.nextInt();
            int pos;
            int value;
            switch(choice)
            {
                case 0:
                        System.out.println("Exiting..");
                        flag = true;
                        break;
                case 1:
                        System.out.print("Enter position to insert: ");
                        pos = read.nextInt();
                        System.out.print("Enter element to insert: ");
                        value = read.nextInt();

                        // for(int i=pos-1; i<size+1; i++)
                        // {
                        //     int temp = arr[i];
                        //     arr[i] = value;
                        //     value = temp;
                        // }
                        // size++;

                        for(int i=size+1; i>pos-1; i--) arr[i] = arr[i+1];

                        arr[pos-1] = value;
                        size++;
                        System.out.println("Array elements: ");
                        for(int i=0; i<size; i++) 
                        {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println("\n");
                        break;
                case 2:
                        System.out.print("Enter element position to delete: ");
                        pos = read.nextInt();

                        for(int i=pos-1; i<size-1; i++)
                        {
                            arr[i] = arr[i+1];
                        }
                        size--;
                        System.out.println("Array elements: ");
                        for(int i=0; i<size; i++) 
                        {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println("\n");
                        break;

                case 3:
                        System.out.print("Enter position of element to update value: ");
                        pos = read.nextInt();
                        System.out.print("Enter new value: ");
                        value = read.nextInt();
                        arr[pos-1] = value; 
                        for(int i=0; i<size; i++) 
                        {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println("\n");
                        break;

                default :
                        System.out.println("Invalid choice");
                        System.out.println();    
            }
        }
    }
}