package E4Que2;

public class ThreadB1 extends Thread{
	A1 a1;
	B1 b1;
	public ThreadB1(A1 a1,B1 b1) {
	this.b1=b1;
	this.a1=a1;
	}
	@Override
	public void run() {
	b1.funB(a1);
	}
	}
