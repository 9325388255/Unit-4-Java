package E4Que2;

public class ThreadA1 extends Thread{
	A1 a1;
	B1 b1;
	public ThreadA1(A1 a1,B1 b1) {
	this.b1=b1;
	this.a1=a1;
	}
	@Override
	public void run() {
	a1.funA(b1);
	}
}
