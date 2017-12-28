package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;

public class reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filename="C:\\Users\\Karanvir\\Desktop\\21days\\passwords.txt";
		//C:\Users\Karanvir\Desktop\21days
		String texts=null;
		String[] possible= new String[13];
		File filez=new File(filename);
		BufferedReader br;
		int count=0;
		
		
		
		try {
			
			br= new BufferedReader(new FileReader(filez));
			for(int i=0;i<possible.length;i++){
			possible[i]=br.readLine();
			
			
			}
			name(possible);
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		

		} catch(exc e){
			e.printStackTrace();
		}
	//main method stops here
	}
	 public static void name(String[] candidate)throws Exception{
		  
		  
		  
		  for (int i = 0; i < candidate.length; i++)
		{
			for(int i1=0;i1< candidate[i].length();i1++){
			
		char c = candidate[i].charAt(i1);

		if (Character.isDigit(c))
		    {    if(aLetter(candidate[i])==true){
		    
		    		if(aSpecial(candidate[i])==true){
		    		
		    		System.out.println("good");
		    		}
		    		if(!aSpecial(candidate[i])==true){
		    		throw new exc(candidate[i]);
		    		//throw
		    		}
		    		
		    		
		    }
		   	else if(!aLetter(candidate[i])==true){
		    		//throw exception
		   		throw new exc(candidate[i]);
		    		}	
		    
		    
		    
		    
		    
		    
		    
		    }
		    if (Character.isDigit(c)!=true)
		    {
		    
		    
		    
		    }
		  
		    
		    

		}

		    

		}

		}

		public static boolean aLetter(String x){



		  	for(int i1=0;i1< x.length();i1++){
		  	char c=x.charAt(i1);
		  		
		   		if (Character.isLetter(c)){
		   		
		   		return true;
		   		
		   		
		   		
		   		}
				
				

				



		}
		return false;
		}
		public static boolean aSpecial(String x){
		for(int i=0;i<x.length();i++){
		char c=x.charAt(i);
		if(x=="@"||x=="#"){
		return true;

		}
		if(x=="!"){
		return true;

		}


		}

		return false;
		}

		}