import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol="";
		System.out.println("Enter no of Rows:");
		rows=scanner.nextInt();
		System.out.println("Enter no of Columns:");
		columns=scanner.nextInt();
		System.out.println("Enter Symbol:");
		symbol=scanner.next();
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}

