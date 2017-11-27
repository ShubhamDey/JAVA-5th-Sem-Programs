abstract class Loan
{
	double loanAmount,interestRate,noOfYears;
	abstract double calculateInterest();
	Loan(double p,double r,double t)
	{
		loanAmount=p;
		interestRate=r;
		noOfYears=t;
	}
}
class EducationLoan extends Loan
{
	EducationLoan(double p,double r,double t)
	{
		super(p,r,t);
	}
	double calculateInterest()
	{
		return ((loanAmount*interestRate*noOfYears)/100);
	}
	void display()
	{
		System.out.println("EducationLoan/SimpleInterest: " +calculateInterest());
	}
}
class HomeLoan extends Loan
{
	HomeLoan(double p,double r,double t)
	{
		super(p,r,t);
	}
	double calculateInterest()
	{
		return (loanAmount*Math.pow((1+(interestRate/100)),noOfYears));
	}
	void display()
	{
		System.out.println("HomeLoan/CompoundInterest: " +calculateInterest());
	}
}
class Main
{
	public static void main(String args[])
	{
		EducationLoan obj1=new EducationLoan(19000,6,3);
		obj1.calculateInterest();
		obj1.display();
		HomeLoan obj2=new HomeLoan(19000,6,3);
		obj2.calculateInterest();
		obj2.display();
	}
}