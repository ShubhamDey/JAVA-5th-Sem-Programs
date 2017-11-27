import java.lang.*;
public class Palindrome{
	public static void main(String args[]){
		StringBuffer str = new StringBuffer(args[0]);
		String str2=new String();
		str.reverse();
		str2=str.toString();
		if(str2.equalsIgnoreCase(args[0]))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
