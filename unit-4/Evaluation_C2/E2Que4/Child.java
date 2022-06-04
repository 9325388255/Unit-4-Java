package E2Que4;

import java.util.Scanner;

final class Child extends Java{
	
	@Override
	void method1() {
		System.out.println(" Number is  " +this.number);
	}
	
	void method4() {
		System.out.println("Method 4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();		
				
		Scanner sc1 =new Scanner(System.in);
		
		System.out.println("Enter a Number 1 to 10 : ");
	
		int no = sc1.nextInt();
		if(no > 10 | no < 1) {
			System.out.println("Plase provide no between 1 to 10 only");
		}else {
			c.method1();
			c.method2();
			c.method3();
			c.method4();
		}
	}


}
