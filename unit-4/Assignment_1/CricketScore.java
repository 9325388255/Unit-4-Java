package Assignment1;

public class CricketScore {
	
	
	void findScore(int a, int b, int c, int d, int e) {
		
		int score = 1*a + 2*b + 3*c+ 4*d + 6*e;
		System.out.println(score);	
	}
	
	public static void main(String[] args) {
		
		CricketScore x = new CricketScore();
		x.findScore(10, 2, 4, 6, 9);
	}
}
