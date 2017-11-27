import java.lang.*;
public class StringRev{
	public static void main(String args[]){
		StringBuffer str = new StringBuffer(args[0]);
		str.reverse();
		System.out.print("Reversed String is " +str);
	}
}
