class StudentTest
{
	int rollNumber,math,chemistry;
	void getRollNumber(int r)
	{
		rollNumber=r;
	}
	void getMarks(int m,int c)
	{
		math=m;
		chemistry=c;
	}
	void displayRollNumber()
	{
		System.out.println("Roll no. is: " +rollNumber);
	}
	void displayMarks()
	{
		System.out.println("Maths: " +math +" Chemistry: " +chemistry);
	}
}
interface Sports
{
	final int sportWt=55;
	abstract void displayWt();
}
class Result extends StudentTest implements Sports
{
	void displayResult()
	{
		displayMarks();
		System.out.println("Total score is: " +(math+chemistry+sportWt));
	}
	public void displayWt()
	{
		System.out.println("Sport :" +sportWt);
	}
}
class Main
{
	public static void main(String args[])
	{
		Result res=new Result();
		res.getMarks(85,90);
		res.displayResult();
	}
}