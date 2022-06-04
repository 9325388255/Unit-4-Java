package Assign15Que2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class NioWrite {
			
		public static void main(String[] args) throws IOException {
			
			Path p = Paths.get("d://abc.txt");
			String msg="welcome to java";
			//writing a normal string
			Files.write(p, msg.getBytes());

			List<String> list= Arrays.asList("\n", "delhi","mumbai","kolkata","chennai");
			//writing a List of String
			//Files.write(p, list);
			//In append mode
			Files.write(p, list,StandardOpenOption.APPEND);
			System.out.println("done...");
			}
	}
	
	


