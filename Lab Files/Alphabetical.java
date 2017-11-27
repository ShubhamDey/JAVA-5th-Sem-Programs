import java.io.*;
public class Alphabetical{
	public static void main(String args[]) throws IOException{
		int i,j;
		String temp = new String();
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader scan = new BufferedReader(input);
		System.out.print("Enter no. of names:");
		int n = Integer.parseInt(scan.readLine());
		String arr[] = new String[n];
		for(i=0;i<n;i++)
			arr[i]=scan.readLine();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i].compareTo(arr[j])>1)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i] +"\t");
	}
}
