public class MethodOverLoading{

	public static void main(String[] args){
		//samesignature method name but parameters different
       double x=add(1.0,2.0,3.0,4.3);
       System.out.println(x);
	}
	static int add(int a,int b){
		System.out.println("This olm 1");
		return a+b;

	}
	static int add(int a,int b,int c){
		System.out.println("This olm 2");
		return a+b+c;

	}
	static int add(int a,int b,int c,int d){
		System.out.println("This olm 3");
		return a+b+c+d;

	}
    
    static double add(double a,double b,double c,double d){
		System.out.println("This olm 3");
		return a+b+c+d;

	}
	  static double add(double a,double b){
		System.out.println("This olm 3");
		return a+b;

	}
	  static double add(double a,double b,double c){
		System.out.println("This olm 3");
		return a+b+c;

	}
}