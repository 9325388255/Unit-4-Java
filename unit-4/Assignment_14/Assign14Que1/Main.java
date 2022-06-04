package Assign14Que1;

//1)Make a thread that will calculate a product of 10 digits and another thread (main thread ) 
//will print the calculated value of the first thread.

class A implements Runnable{
	
	int mul=1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++){
			//System.out.println("Inside class A");
			mul = mul * i;
		}		
	}
}

public class Main{
	
	public static void main(String[] args) throws InterruptedException {
		
		A a1 = new A();
		
		Thread t1 = new Thread(a1);
		
		t1.start();
		
		t1.join();
		
		int result = a1.mul;
					
		System.out.println(result);		
	}
	
}
