package E4Que2;

public class A1 
{		
	public synchronized void funA(B1 b1)
	{
		System.out.println("Hiiiiiiiiii funA");
		b1.fun2();
		System.out.println("Byeeeeeeee funA");
	}
	
	public synchronized void fun1()
	{
		System.out.println("Hello World from A");
	}
}