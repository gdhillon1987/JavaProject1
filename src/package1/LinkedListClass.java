package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass 
{
	protected void exercise2()
	{
	//	1. Create your own LinkedList object
	//	2. Add the following objects to the newly created LinkedList object
	//		a. 2 String objects
	// 		b. 1 MyOwnClass object (You will have to create MyOwnClass.java first) 
	//		c. 3 Integer objects
	//	3. Display the LinkedList object
	
		
	MyOwnClass myOwnClassObj = new MyOwnClass();
    
    LinkedList list = new LinkedList();
    list.add("R");
    list.add("U");
    list.add(myOwnClassObj);
    list.add(10);
    list.add(0);
    list.add(23);
    
    
    //3. Displayed the linkedlist object.
    System.out.println();
    System.out.println("LinkedList displayed : "+list +list.size());
    
	//Exercise 1.2
			//4. Add Integer objects to the beginning and end of the Linked List object and display them.
			list.addFirst(11);
			list.addLast(12);
			System.out.println("New LinkedList first and last elements : "+list.getFirst()+ " , " + list.getLast());
			System.out.println("New LinkedList - " +list);
			
			//Remove the first and the last objects from the LinkedList object and display them - have not displayed them.
			System.out.println("First ELement removed   -" + list.removeFirst());
			System.out.println("Last ELement removed    -" + list.removeLast());
			System.out.println("New LinkedList - " +list);
			
			//6. Remove the first instance of Integer() object and display them.
			
			Iterator listItr2 = list.iterator();
			 
				while(listItr2.hasNext()) 
				{
					Object listObj = listItr2.next();
					if(listObj.getClass().equals(Integer.class))
					{
						System.out.println(listObj);
						listItr2.remove();
						break;
					}
				}
				System.out.println("New LinkedList after removing first integer element- " +list);
				
				
			//7. Add a String “Boston” and Long “Long(45L)”objects to the LinkedList and display them.	
				list.addFirst("Boston");
				list.addFirst(45);
				System.out.println("New LinkedList after adding 2 elements - " +list);
				
			//8. Get the index of the "Boston" String object and display them.
				System.out.println("Index of Boston -- " +list.indexOf("Boston"));
				
			//9. Set the value of the second item to "one" and display them.
				
				list.set(1, "one");
				System.out.println("New LinkedList after setting 2nd element as one - " +list);
			
			//10. Exercise the following methods 
			//a. Add the 2nd instance of the MyOwnClass object to the 3rd position
		
				MyOwnClass myownclassobj2 = new MyOwnClass();
				list.set(2, myownclassobj2);
				System.out.println("New LinkedList after setting myownclassonj2 at third position - " +list);
				
			//11. Clone the LinkedList object and display the Cloned linked list.
				
				LinkedList copy = (LinkedList)list.clone();
				System.out.println("Cloned LinkedList   - " +copy);
				
				
}		
}
