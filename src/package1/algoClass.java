package package1;

import java.util.ArrayList;
import java.util.*;

public class AlgoClass 

{
 protected void exercise5()
 {
	 
	 System.out.println();
	 System.out.println("-------------------------------Algorathmic Operations---------------------------------------");
	 
	// 1. From the array Test data:
	//	 a. Create arraylist and display them
	//	 b. Sort the elements in natural order and display them

	 String n[] = {new String("John"), new String("Karl"), new String("Groucho"), new String("Oscar")};

	 ArrayList arr = new ArrayList(Arrays.asList(n));
/*	 arr.add("John");
	 arr.add("Karl");
	 arr.add("Groucho");
	 arr.add("Oscar");
*/	 arr.sort(null);
	 System.out.println(arr);
	 
//	 2. From the array Test data:
//	 	a. Create arraylist and display them
//	 	b. Sort the elements in natural order and display them

	 Integer int1[] = {new Integer(56), new Integer(78), new Integer(34), new Integer(10)};
	 
	 ArrayList arr1 = new ArrayList(Arrays.asList(int1));
	 arr1.sort(null);
	 System.out.println(arr1);

/*	 1. Given the arraylist below :
  	 a. Sort the elements in ascending order and display them 
		 (Both before and after Sorting)
	 b. Sort the elements in descending order and display them 
		 (Both before and after Sorting) (HINT for a and b: You need to use Comparator to sort in any specific order
*/
 		 ArrayList a1 = new ArrayList();

		 a1.add("Boston");
		 a1.add("New York");
		 a1.add("Seoul"); 
 		 a1.add("Tokyo");
 		 a1.add("London");
 		 a1.add("Bangkok");
 
 		 System.out.println("Before sorting = " + a1);
 		 
 		 a1.sort(null);
 		System.out.println("After sorting ascending= " + a1);
 		
 	// Important - Reverse sort the array list	- import java.util.Collections
 		a1.sort(Collections.reverseOrder());
 		System.out.println("After sorting descending = " + a1);

	
 /*
  2. Given the arraylist below :
  	a. Sort the elements in ascending order and display them (Both before and after Sorting)
	b. Sort the elements in descending order and display them 
(Both before and after Sorting) (HINT for a and b: You need to use Comparator to sort in any specific order)
*/
 		ArrayList a2 = new ArrayList(); 
 		a2.add(new Integer(33)); 
 		a2.add(new Integer(17)); 
 		a2.add(new Integer(45));
 		a2.add(new Integer(100)); 
 		a2.add(new Integer(3)); 
 		System.out.println("Before sorting = " + a2);

 		a2.sort(null);
 		System.out.println("After sorting ascending = " + a2);
 		
 		a2.sort(Collections.reverseOrder());
 		System.out.println("After sorting descending = " + a2);
 		
 	 	
 /*		
 		2. Given the array Test data:	
 			a. Create an arraylist and display them
			b. Reverse the elements of the list and display them
 		
 */		
 		
 		String n2[] = { new String("John"), new String("Karl"), new String("Groucho"), new String("Oscar")};
 		
 		ArrayList arr2 = new ArrayList(Arrays.asList(n2));
 		System.out.println("Before reverse sorting = " + arr2);
 		Collections.reverse(arr2);
 		System.out.println("After reverse sorting = " + arr2);
 		Collections.shuffle(arr2);
 		System.out.println("After shuffle sorting = " + arr2);
 			
 		
 /*
  Given the array Test data:
  	a. Create an arraylist and display them
	b. Do a binary search for element “Boston” in the created arraylist and print its position.
  */

 		String n4[] = {new String("Boston"), new String("New York"), new String("Seoul"), new String("Shanghai")};
 		ArrayList arr3 = new ArrayList(Arrays.asList(n4));
 		System.out.println("The arraylist has elements: " +arr3);
 		
 		//Binary Search
 		System.out.println(Collections.binarySearch(arr3, "New York"));
 		
	

 		
 		
		
	 
		
	 
 }
	
	
	
}
