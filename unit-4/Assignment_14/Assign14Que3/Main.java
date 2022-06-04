package Assign14Que3;

//3)Write the fun1() method of Common class using synchronised block to get the Class level lock. 
//(You problem from notes)

class Common{
public void fun1(String name){
	
	synchronized(Common.class) {
		System.out.print("Welcome ");
		try{
		Thread.sleep(1000);
		}
		catch(Exception ee){
		}
		System.out.println(name);
		}
	}
}

class ThreadA extends Thread{
Common c;
String name;
public ThreadA(Common c,String name) {
this.c=c;
this.name=name;
}
@Override
public void run() {
c.fun1(name);
}
}
class ThreadB extends Thread{
Common c;
String name;
public ThreadB(Common c,String name) {
this.c=c;
this.name=name;
}
@Override
public void run() {
c.fun1(name);
}
}


public class Main{

	public static void main(String[] args) throws InterruptedException{
		Common c1=new Common();
		Common c2=new Common();
		//sharing same Common object to two thread
		ThreadA t1=new ThreadA(c1,"Ram");
		ThreadB t2=new ThreadB(c2,"Shyam");
		t1.start();
		
		t2.start();
		}
}
