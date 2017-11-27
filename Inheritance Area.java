class Figure
{
	double area()
	{
		return 0;
	}
}
class Circle extends Figure
{
	double radius;
	Circle(double r)
	{
		radius=r;
	}
	double area()
	{
		return(3.14*radius*radius);
	}
}
class Triangle extends Figure
{
	double base,height;
	Triangle(double b,double h)
	{
		base=b;
		height=h;
	}
	double area()
	{
		return(0.5*base*height);
	}
}
class Rectangle extends Figure
{
	double length,width;
	Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	double area()
	{
		return(length*width);
	}
}
class Square extends Figure
{
	double side;
	Square(double s)
	{
		side=s;
	}
	double area()
	{
		return(side*side);
	}
}
class Main
{
	public static void main(String args[])
	{
		double r,b,h,l,w,s;
		Circle ci=new Circle(5);
		Triangle tr=new Triangle(5,10);
		Rectangle re=new Rectangle(5,10);
		Square sq=new Square(5);
		System.out.println("Circle: " +ci.area());
		System.out.println("Triangle: " +tr.area());
		System.out.println("Rectangle: " +re.area());
		System.out.println("Square: " +sq.area());
	}
}