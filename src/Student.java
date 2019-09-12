import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	public int rollNo, noOfSubjects;
	public String Name;
	float[] marks ;
	final float totalMarks = 100;
	float percent;
	
	public Student(int rollNo, int noOfSubjects, String name) {
		super();
		this.rollNo = rollNo;
		this.noOfSubjects = noOfSubjects;
		Name = name;
	}
	
	ArrayList<Float> array = new ArrayList<Float>(noOfSubjects);
	public void addMarks() {
		System.out.println("Enter "+ this.Name + " marks:");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<noOfSubjects; i++) {
			array.add(sc.nextFloat());
			}
		sc.close();
		System.out.println(array);
	}
	
	public float calcPercent() {
		float sum=0;
		for(int i=0;i<noOfSubjects;i++) {
		 sum = sum+ array.get(i);
		}
		percent = (sum/totalMarks)*100;
		System.out.println(this.Name+ " percentage is: "+ percent+ "%");
		return percent;
	}
	
	public void getGrade() {
		String grade = null;
		if(percent>80) {
			grade= "first class";
		}else if(percent<80&& percent>60) {
			grade= "second class";
		}else {
			grade="third class";
		}
		 System.out.println("class received : "+ grade);
	}
	

	public static void main(String[] args) {
		
		Student s = new Student(1,2,"Chinmay");

		s.addMarks();
		s.calcPercent();
		s.getGrade();
		
	}
	
}
