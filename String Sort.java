import java.util.*;
import java.lang.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String fn=sc.nextLine();
		StringBuffer str=new StringBuffer(fn);
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=0;j<str.length()-i-1;j++)
			{
				if(str.charAt(j)>str.charAt(j+1))
				{
					str.insert(j,str.charAt(j+1));
					str.delete(j+2,j+3);
				}
			}
		}
		System.out.println(str);
	}
}