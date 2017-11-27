import java.util.*;
interface Area
{
	abstract double compute(double x,double y);
	final double Pi=3.14;
}
interface Display
{
	abstract void show(double r);
}
class Rectangle implements Area,Display
{
	double res;
	public double compute(double x,double y)
	{
		return(x*y);
	}
	public void show(double r)
	{
		System.out.println("Area of rectangle: " +r);
	}
}
class Circle implements Area,Display
{
	public double compute(double x,double y)
	{
		return(Pi*x*x);
	}
	public void show(double r)
	{
		System.out.println("Area of circle: " +r);
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Rectangle rec=new Rectangle();
		System.out.println("Enter length & breadth for rectangle: ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double res=rec.compute(l,b);
		rec.show(res);
		Circle cir=new Circle();
		System.out.println("Enter radius for circle: ");
		double s=sc.nextDouble();
		double re=cir.compute(s,s);
		rec.show(re);
	}
}