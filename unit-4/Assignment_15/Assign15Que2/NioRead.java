package Assign15Que2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioRead {
	
	public static void main(String[] args) throws IOException {
		
		Path p = Paths.get("d://abc.txt");
		List<String> list= Files.readAllLines(p);
		
		System.out.println("Reading from the file");
		
		for(String line:list) {
			System.out.println(line);
		}
		
	}
	
	

}
