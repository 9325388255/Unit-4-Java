package Assign15Que2;

import java.io.FileReader;
import java.io.IOException;

public class FileR {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d://abc.txt");
		int i=fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		}
		}

}
