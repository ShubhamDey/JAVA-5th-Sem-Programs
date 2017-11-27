public class factorial{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		fact obj= new fact();
		System.out.println("The result is:" +obj.f(a));
	}
}
class fact{
	static int f(int a){
		if(a==1 || a==0)
			return 1;
		else
			return f(a-1)*a;
	}
}
