package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt=null;
		
		
		String filename="C:\\Users\\Karanvir\\Desktop\\21days\\phones.txt";
		File fileintoJava= new File(filename);
		try {
			BufferedReader br= new BufferedReader(new FileReader(fileintoJava));
		
			txt=br.readLine();
			if(txt.length()<=7){
				br.close();
				throw new exc(txt);
			}
			System.out.println(txt);
			br.close();
			//if (txt.isEmpty())
			//throw new exception made 	throw new 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(exc e){
			e.printStackTrace();
		}
		finally{
			if(!txt.equals(null))
			System.out.println(txt);
		}
		
		

	}

}
