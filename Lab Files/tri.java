class tri{
	public static void main(String args[]){
	t obj=new t(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	obj.display();
	}
}
class t{
	int base,height,a;
	t(int b,int h){
		base=b;
		height=h;
		a=(b*h)/2;
	}
	void display(){
		System.out.println("The area is:" +a);
	}
}
