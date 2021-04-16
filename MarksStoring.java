import java.util.Scanner;
public class MarksStoring{
	public static void main(String[] args){

		String[] cars={"Camaro","Corvette","Tesla"};
		cars[0]="AppleCar";
		//System.out.println(cars[0]);
		for(int i=0;i<cars.length;i++){
			System.out.println(cars[i]);
		}
		String[] students=new String[3];
		String[] marks = new String[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 names and marks:");
		for(int i=0;i<students.length;i++){
            students[i]=scanner.nextLine();
            marks[i]=scanner.nextLine();
		}
		for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


	}
	
}