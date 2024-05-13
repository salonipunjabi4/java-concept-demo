package java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		var path = "C:\\pictures\\data.txt";
//		var path = "data.txt";
		
		var path = "E:\\a.txt";
		Files.writeString(Path.of(path), "Welcome to Cogent", StandardOpenOption.CREATE);
		String result = Files.readString(Path.of(path));
		System.out.println(result);
		
		
		
		

	}

}
