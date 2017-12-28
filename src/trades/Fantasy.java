package trades;
import java.util.*;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.util.regex.*;

public class Fantasy {

	private static final List InPlayerNames = null;
	public static void main(String[] args) {
		
		String infoComingIn = null;
		//Finding file path 
		String filename="C:\\Users\\Karanvir\\Desktop\\21days\\players.txt";
		//creating the file in java
		File filez=new File(filename);
		//create a buffer reader to read the file
		BufferedReader br;
		BufferedReader br2;
		int counterOfReadLines=0;
		/*System.out.println("Enter the players to trade away, use full names:");
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();*/
		
		//pattern
		 Pattern p=Pattern.compile("[0-9]{1,3}");
		 Pattern patternOfNames=Pattern.compile("[a-zA-Z\\s\\.]+");
		
		 
		 //creating array list for holding values of read info from doc
		 ArrayList<Integer> PlayerRanking = new ArrayList<Integer>();
		 ArrayList<String> PlayerNames = new ArrayList<String>(); 
		 
		 //creating array list for input streams from user.
		 ArrayList<String> InPlayerNamesRecieve = new ArrayList<String>();
		 ArrayList<String> InPlayerNamesLost = new ArrayList<String>(); 
		 
		 //scanner iformation
		 
		 
		try {
			br = new BufferedReader(new FileReader(filez));
			br2 = new BufferedReader(new FileReader(filez));
			
			
			
			// add to array of strings
			
				//add to array of strings
			
				//then we will be looking for numbers using regex, and matching position in Stringarray with the number position in Intarray
			 String sCurrentLine;

	            while ((sCurrentLine = br.readLine()) != null) {
	            	Matcher m=patternOfNames.matcher(sCurrentLine);
	            	
	            	
	            	if(m.find()){
	            		String grouping=m.group(0);
	            		
	            		
		                PlayerNames.add(grouping);
		               
		                System.out.println(PlayerNames.toString());
		                
		                
		               
	            		
	            	}
	            } 
	           
	            
	            String sCurrentLine2;
	            while ((sCurrentLine2 = br2.readLine()) != null) {
	            	Matcher m1=p.matcher(sCurrentLine2);
	            	 if(m1.find()){
	            		 
	            		 String grouping1=m1.group(0);
	            		 int grouping11= Integer.valueOf(grouping1);
	            				 
	            		 
	            		 PlayerRanking.add(grouping11);
	            		 System.out.println(PlayerRanking.toString());
		                }
	            }
	           
	            	/* String sCurrentLines;
	            	 while ((sCurrentLines = br.readLine()) != null) {
	 	            	Matcher m1=p.matcher(sCurrentLines);
	 	            	if(m1.find()){
	 	            		int grouping= parseInteger(m1.group(0));
	 		                PlayerRanking.add(grouping);
	 		                System.out.println(PlayerRanking.get(0));

	 	            		
	 	            	}*/
	            	
	                
	            }
	
	
			
		
		 // closed file after we used buffer reader
		
		//now find the numbers in the array of strings and maybe try usign regex
		//lets create a number array
		
		
	
		
		//failed method to get a int from the string, might use non-enhanced now
		
	/*for(String names: playerNames){
			String forIfs=playerNames.toString();
			
				int inserter=Integer.parseInt(String.valueOf(names));
				System.out.println(inserter);
			
		
		
		
		
		}*/
		 
		
		
		
		//try block ends here 
		
	            catch(Exception e){
	        		e.printStackTrace();
	        	}
	
		   		   
	    
		    
		    
		    //Start creating input and storing information
		    //then we will be comparing
		    //finally output results
		  
	//	 System.out.println("Enter Player names to give away: press end when done");
		//    Scanner scanner = new Scanner(System.in);
		  //  String username = scanner.nextLine();
		  //  Scanner sc = new Scanner(System.in);
		  //  int i = sc.nextInt();
	

	
	
	
	
	//end of try and catch
	
	//NOT WORKING NEEDS FIXES RIGHT NOW !SCANNER!
		
		
		//scanner starts here now
		
		//lets get info of players being sent away
		
System.out.println("Enter  players to give");
System.out.println(PlayerNames.size());


Scanner scan = new Scanner(System.in);
	    	
	while (scan.hasNextLine()){
	        	
String line =  scan.nextLine();
	       if (line.toString().equals("done")!=true) {
	    	   InPlayerNamesLost.add(line+" ");		                
		            }        
	            if (line.toString().equals("done")) {
	                break;	                
	                }	
	            
	            
	            
	      
}        
	     
	 
	 
	   	 System.out.println("Enter  players to get");
	   	 
	 

	   	 
	   	 
	   	Scanner scan2 = new Scanner(System.in);
        while (scan2.hasNextLine()){
        	   String line =  scan2.nextLine();
        	
        	if (line.toString().equals("done")!=true) {
       		 
       		InPlayerNamesRecieve.add(line+" ");
	                
	            }
          
            if (line.toString().equals("done")) {
                break;
                
            }
           
            
            
           
        }
       
        
        
        
	 
        int gettingPlayerValues=meth(InPlayerNamesRecieve,PlayerNames,PlayerRanking);
        System.out.println(gettingPlayerValues+ "got values sop");
        int lostValues=meth2(InPlayerNamesLost,PlayerNames,PlayerRanking);;
        
        if(gettingPlayerValues>lostValues){
        System.out.println("good deal");
        }
        else if(gettingPlayerValues==lostValues){
        System.out.println("no point");
        
        
        }else if(gettingPlayerValues<lostValues){
        System.out.println("bad deal");
        
        }
       


        
	}
	private static int parseInteger(String group) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static int meth(List names, List searchingLis, List nameNumber){
		  int totalGive=0;
		  
		  int totalRecieve=0;
		  
		  int sizer=names.size()-1;
		  
		   int ret=-1000;
		   
		   int makeSureAllPlayerAdded=sizer;
		   
		   int returningValue=0;
		   do{
			   
		  for(int i=sizer;i>=0;i--){
			  
		  
		  
		  
	
		  
		  if(searchingLis.contains(names.get(sizer))){
			  
		 
			  int AddingValue=(int) searchingLis.indexOf(names.get(i));
			  int AddingValueNameSearch=(int) nameNumber.get(AddingValue);
			  returningValue=returningValue+AddingValueNameSearch;
		  
		  System.out.println(AddingValueNameSearch+" value for adding values");
		  
		  
		 
makeSureAllPlayerAdded--;
		  }
		  
		  
		  

		  }
		  
		  
		   }while(makeSureAllPlayerAdded>0);
		   return returningValue;
		}
	public static int meth2(List names, List searchingLis, List nameNumber){
		  int totalGive=0;
		  
		  int totalRecieve=0;
		  
		  int sizer=names.size()-1;
		  
		   int ret=-1000;
		   
		   int makeSureAllPlayerAdded=sizer;
		   
		   int returningValue=0;
		   do{
			   
		  for(int i=sizer;i>=0;i--){
			  
		  
		  
		  
	
		  
		  if(searchingLis.contains(names.get(sizer))){
			  
		 
			  int AddingValue=(int) searchingLis.indexOf(names.get(i));
			  int AddingValueNameSearch=(int) nameNumber.get(AddingValue);
		  returningValue=returningValue+AddingValue;
		  
		  System.out.println(AddingValueNameSearch+" value for lost values");
		  
		  
		 
makeSureAllPlayerAdded--;
		  }

		  }
		  
		  
		   }while(makeSureAllPlayerAdded>0);
		   return returningValue;
		}
		}