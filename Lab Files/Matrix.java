import java.io.*;
public class Matrix
{
	public static void main(String args[]) throws IOException
	{
		calc obj= new calc();
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader scan=new BufferedReader(input);
		int mat1[][],mat2[][],i,j;
		System.out.print("Enter the no. of rows:");
		int r=Integer.parseInt(scan.readLine());
		System.out.print("Enter the no. of columns:");
		int c=Integer.parseInt(scan.readLine());
		mat1= new int[r][c];
		mat2= new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter the elements of 1st matrix:");
				mat1[i][j]=Integer.parseInt(scan.readLine());
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("Enter the elements of 2nd matrix:");
				mat2[i][j]=Integer.parseInt(scan.readLine());
			}
		}
		System.out.print("1. Addition\n2. Subtraction\n3.Multiplication\nEnter your choice:");
		int ch=Integer.parseInt(scan.readLine());
		switch(ch)
		{
			case 1:obj.add(mat1,mat2,r,c);
				obj.output(r,c);
				break;
			case 2:obj.sub(mat1,mat2,r,c);
				obj.output(r,c);
				break;
			case 3:obj.mul(mat1,mat2,r,c);
				obj.output(r,c);
				break;
			default:System.out.print("Invalid input");
		}
	}
}
class calc
{
	int i,j,k,res[][];
	void output(int r,int c)
	{
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				System.out.print(res[i][j] +"\t");
			System.out.println();
			
		}
	}
	void add(int mat1[][],int mat2[][],int r,int c)
	{
		res=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				res[i][j]=mat1[i][j]+mat2[i][j];
		}
	}
	void sub(int mat1[][],int mat2[][],int r,int c)
	{
		res=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				res[i][j]=mat1[i][j]-mat2[i][j];
		}
	}
	void mul(int mat1[][],int mat2[][],int r,int c)
	{
		res=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				 for(k=0;k<r;k++)
				{
					res[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
	}
}
