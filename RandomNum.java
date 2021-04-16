import java.util.Random;
public class RandomNum{

	public static void main(String args[]){

		Random random=new Random();
		//these are pseudo random numbers

		int x=random.nextInt(6)+1;//0 to 6
		System.out.println(x);
    
        double y=random.nextDouble();
        System.out.println(y);
       
       boolean z=random.nextBoolean();
       System.out.println(z);
	}
}