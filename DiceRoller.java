import java.util.Random;
public class DiceRoller{
	Random random;
	int number;//global var
	DiceRoller(){
		random=new Random();
		number = 0;
		roll();
	}
	void roll(){
		number=random.nextInt(6)+1;
		System.out.println(number);

	}
}