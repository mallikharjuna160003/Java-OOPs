public class Car{
	String make ="Chevrolert";
	String model="Corvette";
	int year= 2020;
	String color ="Blue";
	double price =50000.00;
	void drive(){
		System.out.println("You drive the car");
	}
	void brake(){
		System.out.println("You stop the car!!");
	}
	//method overriding
	public String toString(){
		return make+"\n"+model+"\n"+color+"\n"+year;
	}
}