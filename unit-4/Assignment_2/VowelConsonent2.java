package Assignment2;

	public class VowelConsonent2 {
		
	public void vowelConsoCheck(String ch) {
			
		if(ch=="a" || ch=="e" || ch=="i" || ch=="o" || ch=="u" || ch=="A" || ch=="E" || ch=="I" || ch=="O" || ch=="U" ){
			  System.out.println("character "+ ch + " is vowel");
		  }
		  else if(ch=="b" || ch=="B" || ch=="c" || ch=="C" || ch=="d" || ch=="D" || ch=="f" || ch=="F" || ch=="g" || ch=="G" || ch=="h" || ch=="H" || ch=="j" || ch=="J" || ch=="k" || ch=="K" || ch=="l" || ch=="L" || ch=="m" || ch=="n" || ch=="M" || ch=="N" || ch=="p" || ch=="P" || ch=="q" || ch=="Q" || ch=="r" || ch=="R" || ch=="s" || ch=="S" || ch=="t" || ch=="T" || ch=="v" || ch=="V" || ch=="w" || ch=="W" || ch=="x" || ch=="X" || ch=="y" || ch=="Y" || ch=="z" || ch=="Z") {
			  System.out.println("character "+ ch + " is consonent");
		  }
		  else {
			  System.out.println(ch + " is invalid character");
		  }	 
		}
		
		public static void main(String[] args) {
			
			VowelConsonent2 v = new VowelConsonent2();//call non static object
			
			v.vowelConsoCheck("i");
			
			v.vowelConsoCheck("N");
			
			v.vowelConsoCheck("&");
		}

}
