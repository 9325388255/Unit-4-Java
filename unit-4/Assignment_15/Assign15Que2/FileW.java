package Assign15Que2;

import java.io.FileWriter;
import java.io.IOException;

public class FileW {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("d://abc.txt");
		fw.write(100);//d will be added
		fw.write("ramesh\r\nwelcome");
		fw.write("\r\n");
		fw.write("india");
		fw.write("\r\n");
		char ch[]={'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("done");
		}

}
