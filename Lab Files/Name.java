import java.io.*;
import java.lang.*;
public class Name{
	public static void main(String args[]) throws IOException{
		StringBuffer str = new StringBuffer();
		String name = new String();
		String middle = new String();
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader scan = new BufferedReader(input);
		System.out.print("Enter the name:");
		name = scan.readLine();
		System.out.print("Enter the middle name:");
		middle = scan.readLine();
		int pos=name.indexOf(' ');
		str.insert(0,name);
		str.insert(pos,' ');
		str.insert(pos+1,middle);
		System.out.print("Enter the full name:" +str);
	}
}
