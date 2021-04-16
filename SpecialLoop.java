import java.util.ArrayList;
public class SpecialLoop{
	static{
		System.out.println("Wow!!!");
	}//it is executing first
	public static void main(String[] args){

		String[] animals = {"cat","dog","bird"};
		for (String i:animals){
			System.out.println(i);
		}
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("PhinApple");
		for(String i:fruits){
			System.out.println(i);
		}
	}
}