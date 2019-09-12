import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DummyStack {


	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public void addElement(int element) {
		System.out.println("ADDED!");
		arr.add(element);	
	}
	
	public void deleteElement() {


		arr.remove(arr.size()-1);
		System.out.println("DELETED!");
	}
	
	public void display() {
		
		System.out.println();
		
			System.out.println(Arrays.toString(arr.toArray()));
		
		
	}
	
	public static void main(String[] args) {
		DummyStack d = new DummyStack();
		
		d.addElement(50);
		d.addElement(43);
		d.addElement(61);
		d.display();
		d.deleteElement();
		d.addElement(85);
		d.display();
//		Scanner sc= new Scanner(System.in);
//		Scanner scc= new Scanner(System.in);
//		int choice;
//		do {
//			System.out.println("1- add. 2-delete. 3-display. 4-exit");
//			System.out.println("Enter choice: ");
//		 choice= sc.nextInt();
//		switch(choice) {
//		case 1:  System.out.println("Enter value to add");
//				int value = scc.nextInt();
//				d.addElement(value);
//				
//		case 2:  d.deleteElement();
//		case 3:	 d.display();
//		case 4:	 break;
//		}}while(choice!=4);
		
		
	
			
		
	}
}
