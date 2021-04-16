public class Main{
	public static void main(String[] args){
		Car myCar = new Car();
		Car myCar1=new Car();
		System.out.println(myCar.model);
		System.out.println(myCar.make);
		System.out.println(myCar.year);
		myCar.drive();
		System.out.println("car2-----");
		System.out.println(myCar1.model);
		System.out.println(myCar1.make);
		System.out.println(myCar1.year);
		myCar1.drive();
	}
}