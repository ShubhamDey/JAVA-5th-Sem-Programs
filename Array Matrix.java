import java.util.*;
class Calculate
{
	int i,j,k,n,res[][], arr1[][], arr2[][];
	
	Calculate(int arr1[][], int arr2[][], int n){
		this.n = n;
		this.res = new int[n][n];
		this.arr1 = new int[n][n];
		this.arr2 = new int[n][n];
		
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	void display()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(res[i][j] +"\t");
			}
			System.out.println(" ");
		}
	}
	void addition()
	{
		System.out.println("ADDITION");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
	}
	void subtraction()
	{
		System.out.println("SUBTRACTION");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				res[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
	}
	void multiplication()
	{
		System.out.println("MULTIPLICATION");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				res[i][j]=arr1[i][k]*arr2[k][j];
			}
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of matrix: ");
		int n=sc.nextInt();
		int arr1[][]=new int[n][n];
		int arr2[][]=new int[n][n];
		
		System.out.println("Enter elements of matrix1: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("A[" +i +"][" +j +"]:");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of matrix2: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("A[" +i +"][" +j +"]:");
				arr2[i][j]=sc.nextInt();
			}
		}
		Calculate add=new Calculate(arr1, arr2, n);
		Calculate sub=new Calculate(arr1, arr2, n);
		Calculate mult=new Calculate(arr1, arr2, n);
		
		add.addition();
		add.display();
		sub.subtraction();
		sub.display();
		mult.multiplication();
		mult.display();
	}
}