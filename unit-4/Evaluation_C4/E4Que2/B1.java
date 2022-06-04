package E4Que2;

public class B1
	{
		public synchronized void funB(A1 a1)
		{
			System.out.println("Hiiiiiiiii funB");
			a1.fun1();
			System.out.println("Byeeeeeee funB");
		}

	public synchronized void fun2(){
	System.out.println("Hello World from funB");
	}
}
