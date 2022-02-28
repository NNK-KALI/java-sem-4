// wap to convert the given degres to radian using math functions

import java.io.*;

public class DegreeToRadian
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader read = new BufferedReader(inp);
		System.out.println("Enter Degrees");
		float deg = Float.parseFloat(read.readLine());
		float rad = (float)(Math.toRadians(deg));
		System.out.println(rad + "Rad");
	}
}

