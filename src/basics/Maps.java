package basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implement map interface
		
		LinkedHashMap<Integer,String>HMap= new LinkedHashMap<Integer, String>();
mapUtil(HMap);
	}
	
	public static void mapUtil(Map<Integer, String> map){
		// add key value pairs
		map.put(101, "steve");
		map.put(22, "karn");
		map.put(44, "name");
		map.put(215, "mika");
		
		//acess elements
		System.out.println(map.keySet());
		
		for(int key: map.keySet()){
			System.out.println(key+" key and value "+map.get(key));
		}
		
	}

}
