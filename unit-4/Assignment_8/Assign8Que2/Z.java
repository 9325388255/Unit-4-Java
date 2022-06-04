package Assign8Que2;

public interface Z extends X, Y {

	@Override
	default void  method2() {
		// TODO Auto-generated method stub
		X.super. method2();
		System.out.println("inside method2 Z");
	}
	
	void  method4();

}
