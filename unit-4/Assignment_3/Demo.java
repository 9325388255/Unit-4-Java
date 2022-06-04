package Assignment3;

public class Demo {
	
	Demo()
	{
		this("kruti");
		System.out.println("This is part of Demo() Constructor");
	}
	
	Demo(String s)
	{
		this(28);
		System.out.println("This is part of Demo(String s) Constructor");
	}
	
	Demo(int i)
	{
		this(10.56f);
		System.out.println("This is part of Demo(int i) Constructor");
	}
	
	Demo(float f)
	{
		System.out.println("This is part of Demo(float f) Constructor");
	}
	
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}
