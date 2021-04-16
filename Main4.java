public class Main4{
	public static void main(String[] args){
		//constructor overloading......same name parameters different
		Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
		System.out.println("Here are the ingredients of your pizza:");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		Pizza pizza1 = new Pizza("thicc crust","tomato","mozzerella");
		System.out.println("Here are the ingredients of your pizza:");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.topping);
		
	}
}