public class WrapperClasses{
	public static void main(String[] args){
     //primitive     //wrapper
	 //---------     //--------
	// boolean        Boolean
	//char            Character
	//int             Integer
	//double          Double

   //autoboxing compiler converts primitive to wrapper class
	Boolean a= true;
	Character b='@';
	Integer c=123;
	Double d=3.14;
	String e="Bro";
  
    //unboxing auto conversion wrapper class to primitive datatypes
    if(a==true){
    	System.out.println("This is true");

    }
    if(b=='@'){
    	System.out.println("This is true");

    }
    if(c==123){
    	System.out.println("This is true");

    }
    if(d==3.14){
    	System.out.println("This is true");

    }
    if(e=="Bro"){
    	System.out.println("This is true");

    }




 

	}
}