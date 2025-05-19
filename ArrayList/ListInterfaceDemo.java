/// Develop a Java program for adding elements   [Apple, Banana, Orange] into an ArrayList
 //and a LinkedList to perform the  following operations with different functions directed  as
 ///follows
 //1. Adding elements,   2. Adding element at specific index, 3. Adding multiple elements, 4. 
//Accessing elements,5. Updating elements, 6. Removing elements,  7. Searching elements,  8. List 
//size, 9. Iterating over list, 10. Using Iterator,  11. Sorting, 12. Sublist, 13. Clearing the list

package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        System.out.println("=== ArrayList Demonstrations ===");
      
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding elements: " + arrayList);
        
        arrayList.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + arrayList);
        
        arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
        System.out.println("After adding multiple elements: " + arrayList);
        
        String firstFruit = arrayList.get(0);
        System.out.println("First fruit: " + firstFruit);
       
        arrayList.set(1, "Kiwi");
        System.out.println("After updating index 1 to Kiwi: " + arrayList);
        
        arrayList.remove("Orange");  // Remove by object
        arrayList.remove(0);
        
        System.out.println("After removing elements: " + arrayList);
        
        boolean containsKiwi = arrayList.contains("Kiwi");
        int grapeIndex = arrayList.indexOf("Grape");
        System.out.println("Contains Kiwi? " + containsKiwi);
        System.out.println("Index of Grape: " + grapeIndex);
       
        System.out.println("List size: " + arrayList.size());
       
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
       
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);
        
        List<String> subList = arrayList.subList(0, 2);
        System.out.println("Sublist (0-2): " + subList);
        
        arrayList.clear();
        System.out.println("After clearing: " + arrayList);
        
        System.out.println("\n=== LinkedList Demonstrations ===");
        LinkedList<String> fruits = new LinkedList<>();
        fruits.addFirst("Apple");
        fruits.addLast("Banana");
        fruits.add("Orange");
        System.out.println("LinkedList: " + fruits);
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("After removing first and last: " + fruits);
    }
 }