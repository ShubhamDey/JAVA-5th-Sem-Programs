public class pattern2{
	public static void main(String args[]){
		int r=Integer.parseInt(args[0]);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r-i-1;j++)
				System.out.print(" ");

			for(int j=0;j<=i;j++)
				System.out.print("* ");

			System.out.println();
		}	
	}
}
