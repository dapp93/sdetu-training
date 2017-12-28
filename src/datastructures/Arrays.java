package datastructures;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names ={"karn","hi","hello","vinny","mom","dad","bg"};
		String[] sec=new String[names.length];
		int i=names.length-1;
		
		do{
		for(String x:names){
			System.out.println(x);
			sec[i]=x;
			i--;
			
			
		}
		}while(i!=0);
System.out.println(sec[0]);
	}

}
