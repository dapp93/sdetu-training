package exceptionFiles;

public class common {
	public static void main(String[] args) {
		
		int[] x={1,2,3};
		try{
		for(int i=0;i<=x.length;i++){
			System.out.println(x[i]);
		}
		} catch (Exception e){
			
		}finally{
			System.out.println("ok");
		}
	}

}
