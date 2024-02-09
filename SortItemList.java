//Dang-Uy Nguyen
//Professor Carter
//IS 247 
//Programming Assignment: Sorting Inventory
//Main Driver
//December 11, 2022
import java.util.*;
public class SortItemList {
   public static void main(String[] args) {
      
      Inventory myZoo[] = new Inventory[5]; //Create inventory array
      //Create and put objects into the array at different indexes of the array
      myZoo[0] = new Inventory("Tigress", 10, 15);
      myZoo[1] = new Inventory("Monkey", 7, 3);
      myZoo[2] = new Inventory("Viper", 5, 21);
      myZoo[3] = new Inventory("Crane", 3, 8);
      myZoo[4] = new Inventory("Mantis", 1, 6);
      
         System.out.println("            Before the selection sort: ");
      Inventory.printArray(myZoo); //Prints the array before the sort method
         System.out.println(" ");
      Sorting.selectionSort(myZoo); //Calls the sort method and displays the steps of the sort
         System.out.println(" ");
         System.out.println("            After the selection sort: ");
      Inventory.printArray(myZoo); //Prints the resulting array after the sort method
      Inventory.Shuffle(myZoo); //Shuffles the array to prepare to array for another sort
      
         System.out.println("------------------------------------------------------------");
         System.out.println("            Before the insertion sort: ");
      Inventory.printArray(myZoo); //Prints the array before the sort method
         System.out.println(" ");
      Sorting.insertionSort(myZoo); //Calls the sort method and displays the steps of the sort
         System.out.println(" ");
         System.out.println("            After the insertion sort: ");
      Inventory.printArray(myZoo); //Prints the resulting array after the sort method
      Inventory.Shuffle(myZoo); //Shuffles the array to prepare to array for another sort
      
         System.out.println("------------------------------------------------------------");
         System.out.println("            Before the bubble sort: ");
      Inventory.printArray(myZoo); //Prints the array before the sort method
         System.out.println(" ");
      Sorting.bubbleSort(myZoo); //Calls the sort method and displays the steps of the sort
         System.out.println(" ");
         System.out.println("            After the bubble sort: ");
      Inventory.printArray(myZoo); //Prints the resulting array after the sort method
      Inventory.Shuffle(myZoo); //Shuffles the array to prepare to array for another sort
      
         System.out.println("------------------------------------------------------------");
         System.out.println("            Before the quick sort: ");
      Inventory.printArray(myZoo); //Prints the array before the sort method
         System.out.println(" ");
      Sorting.quickSort(myZoo); //Calls the sort method and displays the steps of the sort
         System.out.println(" ");
         System.out.println("            After the quick sort: ");
      Inventory.printArray(myZoo); //Prints the resulting array after the sort method
      Inventory.Shuffle(myZoo); //Shuffles the array to prepare to array for another sort
      
         System.out.println("------------------------------------------------------------");
         System.out.println("            Before the merge sort: ");
      Inventory.printArray(myZoo); //Prints the array before the sort method
         System.out.println(" ");
      Sorting.mergeSort(myZoo); //Calls the sort method and displays the steps of the sort
         System.out.println(" ");
         System.out.println("            After the merge sort: ");
      Inventory.printArray(myZoo); //Prints the resulting array after the sort method

   }
}

