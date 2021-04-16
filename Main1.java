public class Main1{
	public static void main(String[] args){
		Human human=new Human("Arjun",12,20);
		Human human1=new Human("Arya",12,20);
		System.out.println(human.name);
		System.out.println(human1.name);
		human.drink();
		human.eat();
		human1.drink();
		human.eat();
	}
}