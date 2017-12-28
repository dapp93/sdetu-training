package basics;


import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=0.0;
		String data;
		ArrayList<String[]> list= new ArrayList<String[]>();
		//read a csv statement
		String fileName= "C:\\Users\\Karanvir\\Desktop\\21days\\credit.csv";
		try {
			BufferedReader br= new BufferedReader(new FileReader(fileName));
			
			
			
			while((data=br.readLine())!=null) {
				String[] dataInput=data.split(",");
				list.add(dataInput);
				
			}
			
			for(String[] array: list){
				for(String element: array){
					
					if(element.equals("CREDIT")){
						for(String element1: array){
							if(isDouble(element1)){
								double b=Double.parseDouble(element1);
								balance=balance+b;
								System.out.println(balance);
							}
						}
					}
						if(element.equals("DEBIT")){
							for(String element1: array){
								if(isDouble(element1)){
									double b=Double.parseDouble(element1);
									balance=balance-b;
									System.out.println(balance);
								}
							}
						
					}
					
					
				}
			}
			
			
			
			finalAmount(balance);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	public static boolean isDouble( String input )
	{
		boolean ret=false;
	   try
	   {
	      Double.parseDouble( input );
	      ret= true;
	   }
	   catch( Exception e)
	   {
	      ret=false;
	   }
	return ret;
	}
	
	public static void finalAmount (double x){
		String finalAmounts;
		if(x>0){
			finalAmounts="Charging fee";
			x=x*0.10;
			System.out.println(finalAmounts+" "+ x);
			
		}
		
		if(x<0){
			finalAmounts="Overpayment, thanks";
			System.out.println(finalAmounts+" "+x);
		}
		
		
	}
	

}
