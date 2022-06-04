package Assignment3;

public class WholeNo {
	
void acceptWholeNo(int n) {
		
		if(n >=0 ) {
			if(n%2 != 0) {
				System.out.println(n); 
			}
			else if(n%2 == 0) {
				int sum =0;
				for(int i=0; i<9; i++) {
					sum = n + i;
					if(sum%10 == 0) {
						System.out.println(sum); 
					}
				}
				
			}
		}		
		else {
			System.out.println("Error"); 
		}
		
	}

public static void main(String[] args) {
	
	WholeNo x = new WholeNo();
	
	x.acceptWholeNo(45);
	x.acceptWholeNo(44);
	x.acceptWholeNo(-5);
	
}
	

}
