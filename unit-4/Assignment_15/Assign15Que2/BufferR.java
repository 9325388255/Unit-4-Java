package Assign15Que2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferR {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d://abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line != null){
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		}
	}


