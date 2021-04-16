import java.util.ArrayList;
public class ListOfList{
   
   public static void main(String[] args){
      
      ArrayList<ArrayList<String>> items=new ArrayList<>();
 
   	  ArrayList<String> bakeryList = new ArrayList<>();
   	  bakeryList.add("Pasta");
   	  bakeryList.add("garlic beard");
   	  bakeryList.add("donuts");
   	  System.out.println(bakeryList);
   	   ArrayList<String> productsList = new ArrayList<>();
   	  productsList.add("Coco");
   	  productsList.add("Pepsi");
   	  productsList.add("Soda");
   	  System.out.println(productsList);
   	  ArrayList<String>  groceryList = new ArrayList<>();
   	  groceryList.add("Tomato");
   	  groceryList.add("Alu");
   	  groceryList.add("Ginger");
   	  System.out.println(groceryList);

   	  items.add(groceryList);
   	  items.add(productsList);
   	  items.add(bakeryList);
   	  System.out.println(items);
      
      System.out.println(items.get(0).get(2));
   }
}