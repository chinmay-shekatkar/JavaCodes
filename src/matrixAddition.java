import java.util.Scanner;

public class matrixAddition {

	public int[][]original= new int[3][3];
	Scanner sc= new Scanner(System.in);
	public int row[] = new int[3];
	public int col[] = new int[3];
	
	public void setArray() {
		System.out.println("Enter Matrix Values: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				original[i][j]= sc.nextInt();
			}
		}
	}
	
	public void rowAdd() {
		int j=0;
		do {
		for(int i=0; i<3;i++) {
			row[i]+= original[i][j];
			}
		j++;
		}
		while(j<3);
		
	}
	
	public void colAdd() {
		int j=0;
		do {
		for(int i=0; i<3;i++) {
			col[i]+= original[j][i];
			}
		j++;
		}
		while(j<3);
		
	}
	
	public void prin() {
		for(int i=0;i<3;i++) {
			System.out.print("row matrix sum: "+row[i]);
		}
		System.out.println("");
		for(int i=0;i<3;i++) {
			System.out.print("col matrix sum: "+col[i]);
		}
	}
	
	
	public static void main(String[] args) {
		matrixAddition m = new matrixAddition();
		m.setArray();
		m.rowAdd();
		m.colAdd();
		m.prin();
	}
}
