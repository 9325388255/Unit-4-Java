package Assign8Que2;

public interface X {
	
//	one abstract method
//	one default method
//	one static method
	
	void method1();
	
	default void method2(){
		System.out.println("inside method2 of X");
	};
	
	static void  method3(){
		System.out.println("inside  method3 of X");
	};
	

}
