package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {


	public static void main(String[] args) {
		 String txt = null;
		// TODO Auto-generated method stub
// 1)reading data from a file
		//first define path from file we want to read
		//String filename="/path of where file is sitting";
		//need 2// for file path
		String filename="C:\\Users\\Karanvir\\Desktop\\21days\\united.txt";
		// 2)create file in java
		File filez=new File(filename);
		
		//3)create a buffered reader to read file.
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filez));
			 txt=br.readLine();
			 br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4) exception once we open pour file we are going to read the file
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			System.out.println(txt);
			
		}
		//5) close the resources, after we read we want to close it
		//this also has a exception
		
		
	}

}
