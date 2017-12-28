package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writter {
	public static void main(String[] args) {
		//1) define path for which we want 2 write
	String filename="C:\\Users\\Karanvir\\Desktop\\21days\\fileToWrite.txt";
	String msg="wrritng data 2 file";
	//2) create file we want to write
	File filez=new File(filename);
	//3)open the file
	FileWriter fr;
	try {
		fr = new FileWriter(filez);
		//4)write the file
		fr.write(msg);
		//5) close the file
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}
