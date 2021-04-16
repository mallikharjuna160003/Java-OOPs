import java.util.Scanner;
public class TwoDArr{
	public static void main(String[] args){

		String[][] cars=new String[3][3];
       Scanner scanner=new Scanner(System.in);
       for(int i=0;i<3;i++){
       	for(int j=0;j<3;j++){
       		System.out.println("Enter car Name:");
       		cars[i][j]=scanner.nextLine();
       	}
       }
       for(int i=0;i<3;i++){
       	for(int j=0;j<3;j++){
       		System.out.print(cars[i][j]+" ");
       		}
       		System.out.println();
       }
	}

     
     String[][] cost={{1,2,3,4},{5,6,7,8}};
      for(int i=0;i<3;i++){
       	for(int j=0;j<3;j++){
       		System.out.print(cars[i][j]+" ");
       		}
       	System.out.println();
       }
	
}

    
