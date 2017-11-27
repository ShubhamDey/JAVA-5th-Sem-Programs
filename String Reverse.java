import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader scan=new BufferedReader(input);
		System.out.print("Enter String: ");
		String str1=scan.readLine();
		StringBuffer str=new StringBuffer(str1);
		System.out.println("Before: " +str);
		System.out.println("After: " +str.reverse());
	}
}