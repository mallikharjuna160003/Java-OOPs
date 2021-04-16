public class Printf{
	public static void main(String[] args){
		int num=1234;
		boolean check=true;
		String name="Arjun";
		double salary=1000;
		char a='@';
		System.out.printf("%dNum\n",123);
		System.out.printf("%d\n",num);
		System.out.printf("%c\n",a);
		System.out.printf("%10s\n",name);//10 spaces  -10 10 spaces after string
		System.out.printf("%b\n",check);
		System.out.printf("%.2f\n",salary);//.2 is limiting decimal places to 2
        System.out.printf("%20f\n",salary);//20 spaces left
        System.out.printf("%020f\n",salary);
	}
}