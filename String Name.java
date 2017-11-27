import java.util.*;
import java.lang.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the full name: ");
		String fn=sc.nextLine();
		StringBuffer str=new StringBuffer();
		System.out.print("Enter the middle name: ");
		String mn=sc.nextLine();
		int pos=fn.indexOf(" ");
		str.insert(0,fn);
		str.insert(pos," ");
		str.insert(pos+1,mn);
		System.out.println(str);
	}
}