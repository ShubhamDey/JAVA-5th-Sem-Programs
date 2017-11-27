import java.util.*;
import java.lang.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=sc.nextLine();
		StringBuffer str=new StringBuffer(str1);
		str.reverse();
		String str2=new String();
		str2=str.toString();
		if(str2.equalsIgnoreCase(str1))
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}
}