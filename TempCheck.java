import java.util.Scanner;
public class TempCheck{
	public static void TempTest(int temp){
		if(temp>30){
			System.out.println("Its too hot outside");
		}
		else if(temp>=20 && temp<=30){
			System.out.println("Its warm outside");
		}
		else{
			System.out.println("Its cold outside ");
		}
	}
	public static void GameQuit(){
		System.out.println("You are playing a game! Press q or Q to quit");
		Scanner scanner = new Scanner(System.in);
		while(true){
			String response = scanner.next();
		if(response.equals("q") || response.equals("Q")){
			System.out.println("You quit the Game!");
			break;
		}
		else{
			System.out.println("You are still in the Game!!!");
			
            
		}
	}
	scanner.close();
	}
	public static void GradeComp(int x,int y){
		if(x!=y){
           System.out.println("Not Equal Grades!!"+x+","+y);
		}
		else if(x==y){
			System.out.println("Equal Grades!!");
		}
		else{
			System.out.println("Check Input");
		}


	}
	public static void main(String[] args){
		int temp=23;
		TempTest(temp);
       GameQuit();
       GradeComp(2,3);

       

	}

}