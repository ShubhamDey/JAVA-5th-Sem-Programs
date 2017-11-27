public class database{
	public static void main(String args[]){
	data obj=new data();
	obj.setInfo(args[0],args[1],Integer.parseInt(args[2]),Integer.parseInt(args[3]));
	obj.display();
	}
}
class data{
	String name,gender;
	int age,salary;
	void setInfo(String n,String g,int a,int s){
		name=n;
		gender=g;
		age=a;
		salary=s;
	}
	void display(){
		System.out.println("Name= " +name +"\nGender= " +gender +"\nAge= " +age +"\nSalary= " +salary);
	}
}	
