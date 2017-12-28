package basics;

import java.awt.List;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.io.FileReader;

public class ReadCSV {
	
	private static final Reader FileReader = null;

	public static void main(String[] args) {
		String dataRow;
		ArrayList<String[]>data = null;
		try{
			
		// TODO Auto-generated method stub
 data=new ArrayList<String[]> ();
String fileName="C:\\Users\\Karanvir\\Desktop\\21days\\Users.csv";
 BufferedReader br= new BufferedReader(new FileReader(fileName));
 //read data aslong as not empty
 
 while ((dataRow=br.readLine())!=null){
	 String[] line=dataRow.split(",");
	 data.add(line);
	 
 }
		}catch(Exception e){
			e.printStackTrace();
		}
		for(String[] arrayz: data){
			for(String elements: arrayz){
				System.out.print(elements);
			}
			System.out.println("]");
			
		}
	}

}
