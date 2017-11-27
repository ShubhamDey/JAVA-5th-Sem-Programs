public class si{
	public static void main(String args[]){
	data obj=new data();
	obj.setInfo(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	obj.display();
	}
}
class data{
	int si,principal,rate,time;
	void setInfo(int p,int r,int t){
		principal=p;
		rate=r;
		time=t;
		si=(p*r*t)/100;
	}
	void display(){

		System.out.println("The simple interest is:" +si);
	}
}
