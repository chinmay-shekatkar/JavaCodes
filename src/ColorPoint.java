import java.util.Scanner;


public class ColorPoint {
	
	int x,y;
	String userSelectedColor;
	String assignedUserColor;
	public static String[] colors ;
	
	static {
		colors= new String[] {"blue", "red", "yellow", "green", "orange"};
		
	}

		
	Scanner sc= new Scanner(System.in);
	
	public void getUserColor() {
		System.out.println("Pick Color: ");
		userSelectedColor= sc.nextLine();
	}
	
	public void validate() {
		for(int i=0;i<5;i++) {
			if(userSelectedColor.equals(colors[i])) {
				assignedUserColor= colors[i];
				break;
			}else {
				assignedUserColor= "white";
			}
		}
		System.out.println("Final User Color is : "+ assignedUserColor);
	}
	
	public static void main(String[] args) {
		ColorPoint c = new ColorPoint();
		c.getUserColor();
		c.validate();
	}
}
