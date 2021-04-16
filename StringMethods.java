public class StringMethods{
	public static void main(String[] args){

		String name=" Ram ";
		boolean result = name.equalsIgnoreCase("Corm");//false
		System.out.println(result);
		int length_=name.length();
		int index=name.indexOf("R");
		char output=name.charAt(0);
		System.out.println(length_+" "+index+" "+output);
		boolean result1=name.isEmpty();
		System.out.println(result1);
		String convertLower=name.toLowerCase();
		System.out.println(convertLower);
		String convertUpper=name.toUpperCase();
		System.out.println(convertUpper);

		String name2=name.trim();
		System.out.println(name2);

		String replace_=name.replace('a','c');
		System.out.println(replace_);

	
	}
}