import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException
	{
		int num, choice, size;
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader read= new BufferedReader(input);
		MyStack obj;	
		System.out.print("Enter stack size: ");
		size= Integer.parseInt(read.readLine());
		obj= new MyStack(size);		
		while(true){
			System.out.println("\n1. Push\n2. Pop\n3. Display\nAny other key to exit\n");		
			System.out.print("Enter your choice: ");
			choice= Integer.parseInt(read.readLine());	
			switch(choice){
				case 1: System.out.print("Enter number to push: ");
						num= Integer.parseInt(read.readLine());
						obj.push(num);
						break;
				case 2: int popped= obj.pop();
						if(popped!=0)
							System.out.println(popped+" popped ");
						else
							System.out.println("Stack is empty");
						break;			
				case 3: obj.display();
						break;
				default: return;		
			}
		}
	}
}
class MyStack
{
	int max, top, stack[];
	MyStack(int s)
	{
		max= s;
		top=-1;
		stack= new int[max];
	}	
	void push(int pushed)
	{
		if(!isFull())	
			stack[++top]= pushed;
		else
			System.out.println("Stack is full");
	}
	int pop()
	{
		int popped;

		if(!isEmpty()){	
			popped= stack[top];
			top--;
			return popped;
		}
		
		return 0;		
	}	
	void display()
	{
		for(int i=top; i>=0; i--)
			System.out.println(stack[i]+"\t");
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;	
	}
	boolean isFull()
	{
		if(top==(max-1))
			return true;
		return false;
	}
}