import java.util.Scanner;

public class InputUsingScanner
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        int i;
        float f;
        double d;
        String s;
        String sl;

        i = read.nextInt();
        f = read.nextFloat();
        d = read.nextDouble();
        s = read.next();
        sl = read.nextLine();

        System.out.println(".......................");
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println(sl);

    }
}