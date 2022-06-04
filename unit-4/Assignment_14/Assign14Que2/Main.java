package Assign14Que2;

class Common{
public synchronized void  fun1(String name){
System.out.print("Welcome ");
//try{
//Thread.sleep(1000);
//}
//catch(Exception ee){
//}
System.out.println(name);
}}

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
		Common c=new Common();
		//sharing same Common object to two thread
		ThreadA t1=new ThreadA(c,"Ram");
		ThreadB t2=new ThreadB(c,"Shyam");
		t1.start();
		
		t2.start();
		}
}
