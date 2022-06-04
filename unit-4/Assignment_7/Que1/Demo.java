package Assign7Que1;

public class Demo {
	
	public static Animal[] getAnimals(){
		
		Animal [ ] arr = { new Cat(), new Dog(), new Tiger()};
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		
		 Animal[] arr = getAnimals();
		 
		 System.out.println("Cat Details : ");
		 
		 arr[0].eat();
		 arr[0].makeNoise();
		 arr[0].walk();
		 
		 System.out.println("");
		 System.out.println("Dog Details : ");
		 
		 arr[1].eat();
		 arr[1].makeNoise();
		 arr[1].walk();
		 ((Dog) arr[1]).handShake();
		 
		 System.out.println("");
		 System.out.println("Tiger Details : ");
		 
		 arr[2].eat();
		 arr[2].makeNoise();
		 arr[2].walk();	 	 
	}
}
