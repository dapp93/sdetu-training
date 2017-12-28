package files;

public class exc extends Exception {
	private String txt;
	
	public exc(String x){
		
		this.txt=x;
	}
	public String toString(){
		return txt+" not good password! needs atleast 1 LETTER,1NUMBER,1SPECIAL";
	}

}
