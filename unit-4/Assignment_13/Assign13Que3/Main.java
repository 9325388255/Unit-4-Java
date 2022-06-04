package Assign13Que3;

import java.util.function.Predicate;
import java.util.function.Supplier;

//Question 3:
//Assignment: Java Day 13 2
//Create a customized  calculator using java 8 predefined functional interface
//Perform the following operations only
//And choose the correct predefined function to perform the operations given below:-
//1. Check if the supplied value is > 0 or not.(using Predicate)
//2. Square (Function) (int return long)
//3. Random number generator (supplier)



public class Main implements calculator {
	
	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
		
	}
	
	static long square(double x) {
		return (long) (x*x);
		
	}
	
	public static void main(String[] args) {
		
		double n = Math.random()*(10-(-10)+1)+(-10);
		
		System.out.println(n);
		
		Supplier<Double> s = ()-> n;
		
		Predicate <Double> p =(i)-> i > 0;
		
		System.out.println(p.test(s.get()));;
		
		System.out.println("Square of No is : "+square(s.get()));;
	}

	

}
