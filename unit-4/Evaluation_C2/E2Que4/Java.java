package E2Que4;

abstract class Java {
	
	int number;	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	abstract void method1();//must ovrrid - abstract method
	
	final void method2() {//cannot override - final 
		
	};

	void method3() {//may or may not
		
	};

}
