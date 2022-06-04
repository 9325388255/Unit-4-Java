package E4Que2;

//Here if any method of class A or class B we remove the synchronized keyword then it will not become deadlock.

public class Main {
public static void main(String[] args) {
A1 a1 = new A1();
B1 b1 = new B1();
ThreadA1 t1 = new ThreadA1(a1, b1);
ThreadB1 t2 = new ThreadB1(a1, b1);
t1.start();
t2.start();
}
}
