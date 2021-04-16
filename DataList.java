import java.util.ArrayList;
public class DataList{
	public static void display(ArrayList<String> food){
		System.out.println("Items:");
		for(int i=0;i<food.size();i++){
       	System.out.println(food.get(i));
       }
	}
	public static void main(String[] args){
		ArrayList<String> food=new ArrayList<String>();
       food.add("Pizza");
       food.add("Hamburger");
       food.add("hotdog");
       display(food);
       food.set(0,"Sushi");
       display(food);

	}
}