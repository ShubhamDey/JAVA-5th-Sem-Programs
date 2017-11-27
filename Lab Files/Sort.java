import java.io.*;
public class Sort{
	public static void main(String args[]) throws IOException{
		int i,arr[],n;
		Calc obj=new Calc();
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader scan=new BufferedReader(input);
		System.out.print("Enter no. of elements:");
		n=Integer.parseInt(scan.readLine());
		arr= new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++){
			System.out.print("Arr[" +i +"]:");
			arr[i]=Integer.parseInt(scan.readLine());
		}
		System.out.print("1. Ascending\n2. Descending\nEnter your choice:");
		int ch=Integer.parseInt(scan.readLine());
		switch(ch){
			case 1:obj.ascending(arr);
				obj.output(arr);
				break;
			case 2:obj.descending(arr);
				obj.output(arr);
				break;
		}
	}
}
class Calc{
	void output(int arr[]){
		int i;
		for(i=0;i<arr.length;i++)
			System.out.print("Arr[" +i +"]:" +arr[i] +"\t");
	}
	void ascending(int arr[]){
		int i,j,temp=0;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void descending(int arr[]){
		int i,j,temp=0;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
