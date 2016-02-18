package package1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass 
{
	protected void exercise3()
	{
		//1. Create your own HashSet object with initial capacity of 5
		//2. Add the following objects to the newly created HashSet object
		//	a. 2 String objects
		//	b. 2 MyOwnClass object (You will have to create MyOwnClass.java first)
		//	c. 3 Integer objects
		//3. Display the HashSet object
		
		MyOwnClass myOwnClassObj = new MyOwnClass();
		Set set = new HashSet(5);
		set.add("R");
		set.add("U");
		set.add(myOwnClassObj);
		set.add(10);
		set.add(0);
		set.add(23);
		
		System.out.println();
		System.out.println("----------------------------------------HASH SET---------------------------------------");
		System.out.println("The set is - " +set);
		
		//4. Add a duplicate item to the HashSet and print the boolean result. 
		//Display the Hashset to check if duplicate elements were added.
		
		System.out.println("adding duplicate value to set   -" +set.add("U"));
		System.out.println("The set is - " +set);
		
		//5.Create your array of Strings called names[] with duplicates 
		//		a. Create a HashSet object from the array and display it and 
		//		make sure there are no duplicates in the set.
		
		String [] sArray = {"a", "b", "c", "c", "e"};
		Set set1 = new HashSet();
		for(String add: sArray)
		{
			set1.add(add);
		}
		System.out.println("Set created fom array   " +set1);
		
		
		//6. Create 2 hashsets :
		//a. Check if 2 hashsets are equal and display the result (Hint – Use equals() method to 
				//compare 2 objects. Also check what happens if you use equality operator i.e. “==”).
	
		HashSet hs1 = new HashSet(5, 0.5f);
			System.out.println(hs1.add("one"));
			System.out.println(hs1.add("two"));
        	System.out.println(hs1.add("three"));
        	System.out.println(hs1.add("two"));
        	//   	Print out the HashSet object
        	System.out.println(hs1);
          
        HashSet hs2 = new HashSet(5, 0.5f);
		      System.out.println(hs2.add("one"));
		      System.out.println(hs2.add("two"));
		      System.out.println(hs2.add("three"));
			  System.out.println(hs2.add("three"));
				// Print out the HashSet object
		    System.out.println(hs2);

		if(hs1.equals(hs2))
		{
			System.out.println("Hash Sets are equal");
		}
		else
		{
			System.out.println("Hash sets are not equal");
		}
		// using ==
		if(hs1 == hs2)
		{
			System.out.println("Hash Sets are equal");
		}
		else
		{
			System.out.println("Hash sets are not equal");
		}
		
	/*	7. Given the below array of test data:
			String numbers[] = {
			            new String("2"),
			            new String("3"),
			            new String("4"),
			            new String("1"),
			            new String("2")
			        }; 

			a. Create HashSet, TreeSet, LinkedHashSet from the array. 
			Which of the above set maintains:
			i. Random order
			ii. Natural order
			iii. Insertion based order
	*/	
		
		
		String numbers[] = { new String("2"), new String("3"), new String("4"), new String("1"), new String("2")};
		Set set2 = new HashSet();
		for(String add: numbers)
		{
			set2.add(add);
		}
		System.out.println("Hash Set created fom String array  - Natural order, sorts in ascending way -  " +set2);
		
		Set treeSet = new TreeSet();
		for(String add: numbers)
		{
			treeSet.add(add);
		}
		System.out.println("Tree Set created fom String array  - Natural order, sorts in ascending way -  " +treeSet);
		
		Set linkedHashSet = new LinkedHashSet();
		for(String add: numbers)
		{
			linkedHashSet.add(add);
		}
		System.out.println("LinkedHashSet Set created fom String array - maintains Insertion based order  order-   " +linkedHashSet);
	
			
		
	}
}
