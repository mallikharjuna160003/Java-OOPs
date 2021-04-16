public class DayCheck{
	public static void main(String[] args){
		String day="Sunday";

		switch (day){
			case "Sunday":
			     System.out.println("Today is Holiday!!!");
			     break;
			case "Monday":
			     System.out.println("Moday");
			     break;
			case "Tuesday":
			     System.out.println("Tuesday");
			     break;
			case "Wednesday":
			     System.out.println("Wednesay");
			     break;
			case "Thursday":
			     System.out.println("Thursday");
			     break;

			case "Friday":
			     System.out.println("Friday");
			     break;
			case "Saturday":
			     System.out.println("Saturday");
			     break;
			default:
			     System.out.println("Not a valid Input");
			     break;

		}
	}
}