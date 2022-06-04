package Assgn13Que1;

import java.util.*;
import java.util.function.Predicate;

//Question 1:
//Create a list of integer in a main class having random numbers
//You need to use given printList function mentioned below which print the List<integer>
//based on the implementation you will pass in argument using java 8 lambda expression
//public static void printList(List<Integer> list, Predicate<Integer> predicate)
//Inside this function use predicate.test(n) which takes the input and return a boolean
//To check which numbers qualify your condition to print
//You need to print
//1. Only Even Number
//2. Number greater than 9
//3. Print all number


public class Main {
	
	public static void printList(List<Integer> list, Predicate<Integer> predicate) {
		
		for(Integer l : list ) {
		 if(predicate.test(l)) {
			 System.out.println(l+ " No is even and greater than 9");
		 }
		 else{
			 System.out.println(l+ " No is less than 10");
		 }
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int c =0;
		while(c<=5) {
			try {
				System.out.println("Enter No: ");
				int no = sc.nextInt();			
				list.add(no);
			}
			catch(Exception e) {
				System.out.println("Please Enter valid Deatils");
			}
			c++;
	}
		Predicate<Integer> p = i -> {
			
			if(i % 2 == 0 && i > 9) {
				return true;
			}
			return false;
		};
		printList( list, p);

}}
