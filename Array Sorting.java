import java.util.*;
class Calc
{
	int temp,i,j,n,arr[];
	Calc(int arr[],int n)
	{
		this.n = n;
		this.arr = new int[n];
		this.arr = arr;
	}
	void ascending()
	{
		System.out.println("ASCENDING");
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>=arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void descending()
	{
		System.out.println("DESCENDING");
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]<=arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i] +"\t");
		}
		System.out.println();
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter quantity of numbers to be sorted:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			System.out.print("A[" +i +"]:");
			arr[i]=sc.nextInt();
		}
		Calc obj1=new Calc(arr,n);
		Calc obj2=new Calc(arr,n);
		obj1.ascending();
		obj1.display();
		obj2.descending();
		obj2.display();
	}
}