package Assign8Que2;

public interface Y {
	
	void method1();
	
	default void  method2(){
		System.out.println("inside  method2 of Y");
	};
	
	static void  method3(){
		System.out.println("inside  method3 of Y");
	};
	

}
