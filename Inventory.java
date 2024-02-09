//Dang-Uy Nguyen
//Professor Carter
//IS 247 
//Programming Assignment: Sorting Inventory
//Inventory Class
//December 11, 2022
import java.util.*;
public class Inventory implements Comparable <Inventory> { //Inventory class
   String name; //Attributes
   int cost;
   int count;
   
   Inventory(String myname, int mycost, int mycount) {
      this.name = myname;
      this.cost = mycost;
      this.count = mycount;
   }
   public int compareTo(Inventory obj) { //Compares the count between inventory objects
      return this.count - obj.count;
   }
   public String toString() {
      return count + " " + name + ","; //Prints the stock and name of item
   }
   public static void printArray(Inventory[]myZoo) { //Print method to print formal statement of inventory
      for (Inventory obj : myZoo) {
      System.out.println("There are " + obj.count + " " + obj.name + " toys that cost $" + obj.cost + " each.");
      }
   }
   public static void Shuffle(Inventory []myZoo) { //Method to shuffle the array to sort array again
      List<Inventory> newList = Arrays.asList(myZoo);
      Collections.shuffle(newList);
      newList.toArray(myZoo); 
   }
}
