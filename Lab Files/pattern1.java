public class pattern1{
	public static void main(String args[]){
		int i,j;
		int r=Integer.parseInt(args[0]);
		for(i=1;i<=r;i++)
		{
			for(j=i;j<=r;j++)
			System.out.print(j +" ");
			System.out.println(" ");
		}	
	}
}
