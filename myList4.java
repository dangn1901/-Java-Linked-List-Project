import java.util.*;
public class myList4 {
   public static void main(String args[]) {
   
   mylist ZooList = new mylist("Zoo");

   Animal tigress = new Animal(10, "Tigress", "Tiger");
   Animal gloria = new Animal(23, "Gloria", "Gorilla");
   Animal maurice = new Animal(32, "Maurice", "Hippopotamus");
   Animal john = new Animal(7, "John", "Eagle");
   
   
   ZooList.size();
   System.out.println(ZooList.size());
   ZooList.insertAtBack(tigress);
   ZooList.insertAtBack(gloria);
   ZooList.insertAtBack(john);
   ZooList.insertAtFront(maurice); //Maurice is inserted to the front of the list #1
   ZooList.print(); //Displays Maurice as first item
   
   ZooList.removeFromBack(); //Removes the last item #2
   ZooList.print(); //Displays items with last one removed
   
   Scanner sc = new Scanner(System.in);
      System.out.println("Enter index you would like to print");
      int index = sc.nextInt(); 
         System.out.println(ZooList.SpecificIndexDisplay(index));
   
      
      System.out.println("Enter index you would like to insert at");
      index = sc.nextInt(); 
      
      System.out.println("Enter age:");
      int age = sc.nextInt(); 
      
      System.out.println("Enter name:");
      String name = sc.next(); 
      
      System.out.println("Enter species:");
      String species = sc.next();
      
      
      Animal bb = new Animal(age, name, species);
      ZooList.InsertSpecific(index, bb);
      ZooList.print();
   
   
      System.out.println("Enter index you would like to delete");
      index = sc.nextInt(); 
      ZooList.RemoveIndex(index); 
      ZooList.print();
   }
}

