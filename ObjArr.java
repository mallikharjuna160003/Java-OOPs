public class ObjArr{
	public static void main(String[] args){
		// int[] numbers=new int[3];
		// char[] character=new char[4];
		// String[] strings=new String[5];

		
		Food food1=new Food("pizza");
		Food food2=new Food("hamburger");
        Food food3=new Food("hotdog");
       Food[] refrigerator={food1,food2,food3};
       
        System.out.println(refrigerator[0].name);

	}
}