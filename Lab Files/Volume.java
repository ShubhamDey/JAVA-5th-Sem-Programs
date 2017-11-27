import java.io.*;
public class Volume{
	public static void main(String args[]) throws IOException{
		double r,h,l,b;
		Shape obj=new Shape();
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader scan=new BufferedReader(input);
		System.out.print("1. Sphere\n2. Cone\n3. Box\nEnter your choice:");
		int ch=Integer.parseInt(scan.readLine());
		switch(ch){
			case 1:System.out.print("Enter Radius:");
				r=Integer.parseInt(scan.readLine());
				System.out.println("Volume:" +obj.calculateVolume(r));
				break;
			case 2:System.out.print("Enter Radius:");
				r=Integer.parseInt(scan.readLine());
				System.out.print("Enter Height:");
				h=Integer.parseInt(scan.readLine());
				System.out.println("Volume:" +obj.calculateVolume(r,h));
				break;
			case 3:System.out.print("Enter Length:");
				l=Integer.parseInt(scan.readLine());
				System.out.print("Enter Breadth:");
				b=Integer.parseInt(scan.readLine());
				System.out.print("Enter Height:");
				h=Integer.parseInt(scan.readLine());
				System.out.println("Volume:" +obj.calculateVolume(l,b,h));
				break;
			default:System.out.print("Invalid choice");
		}
	}
}
class Shape{
	double calculateVolume(double r){
		return(4.0/3.0)*(22.0/7.0)*r*r*r;
	}
	double  calculateVolume(double r,double h){
		return(1.0/3.0)*(22.0/7.0)*r*r*h;
	}
	double calculateVolume(double l,double b,double h){
		return l*b*h;
	}
}
