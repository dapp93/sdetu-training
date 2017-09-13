package basics;
import java.util.Random;

public class Student implements studentSkills {
	private String name;
	private String ssn;
	private String email;
	private static int id;
	private int balance;
	private String courses;
	private int phone;
	private String city;
	private String state;
	
	
	public Student(String name, String ssn){
	
		this.name=name;
		this.email=name+"@hotmail.com";
		Random r = new Random();
		int i1 = r.nextInt(4000 - 4) + 4;
		this.id=i1;
		this.ssn=i1+""+ssn;
		this.courses="course1[]course2[]course3[]course4[]";
		

		
		
	}
	
	public void enroll(){
		System.out.println("Student:"+id+" enrolled");
		balance=1000;
	}
	public void pay(){
		balance=0;
		System.out.println("Student pays");
				
		
	}
	public int checkBalance(){
		return balance;
	}
	public  String toString(){
		return (Name+" "+ssn+ " "+Email+" "+id+" "+balance+" "+phone+" "+city+" "+state);
				
	}
	public String showCourses(){
		return courses;
	}
	
	public  void setphone(int phone){
		this.phone=phone;
	}
	public void setCity(String city){
		this.city=city;
	}
	public  void setState(String state){
		this.state=state;
		
	}
	
	

}
