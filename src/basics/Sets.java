package basics;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> animals = new HashSet<String>();
animals.add("hog");
animals.add("dog");
animals.add("cat");
animals.add("pig");
//System.out.println(animals);

animals.add("snake");
animals.add("dog");
animals.add("hog");
animals.add("dog");
animals.add("cat");
animals.add("pig");
//System.out.println(animals);

Set<String> farmAnimals = new HashSet<String>();
farmAnimals.add("cat");
farmAnimals.add("dog");
farmAnimals.add("random");


Set<String>intersect=new HashSet<String>(animals);
intersect.retainAll(farmAnimals);
System.out.println(intersect);
//union
intersect.addAll(animals);
System.out.println(intersect);
//diference
Set<String> difference= new HashSet<String>(animals);
difference.removeAll(farmAnimals);
System.out.println(difference);


}

	}


