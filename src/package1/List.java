package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class List 
{
	protected void exercise1()
	{
	//Exercise 1.1
    //1. + 2. Created an object of MyOwnClass and an array of size 6 and added elements.
    MyOwnClass myOwnClassObj = new MyOwnClass();
    
    ArrayList list = new ArrayList(5);
    list.add("R");
    list.add("U");
    list.add(myOwnClassObj);
    list.add(10);
    list.add(0);
    list.add(23);
    
    
    //3. Displayed the arraylist object.
    System.out.println("ArrayList displayed : "+list +list.size());
     
    //4. Create Iterator object from the ArrayList object and iterate them to get
    //displayed
    
    Iterator listItr = list.iterator();

	while(listItr.hasNext()) {
		Object listObj = listItr.next();
		System.out.println(listObj);
	}
    //5. Create Object array from the ArrayList object and display them in a for loop
	
	for(Object listObj : list) {
		System.out.println(listObj);
	}
    //6. Remove all integers from the Arraylist and display them. -- commented to check Exercise1.2
/*
	 Iterator listItr1 = list.iterator();
	 
	while(listItr1.hasNext()) 
	{
		Object listObj = listItr1.next();
		if(listObj.getClass().equals(Integer.class))
		{
			System.out.println(listObj);
			listItr1.remove();
		}
	}
*/	
	//7. Check if the list contains the specified element and print the result (Boolean value):
	//a. myOwnClassObj of Type MyOwnClass
	//b. myNewObj of Type MyNewClass (Don’t create this class. It should return ‘false’ as output
	//c. 256
	//d. R
	
		if(list.contains("R"))
		{
			System.out.println("R exists in the list");
			
		}
		else
		{
			System.out.println("R does not exist in the list");
		}
		if(list.contains(256))
		{
			System.out.println("256 exists in the list");
		}
		else
		{
			System.out.println("256 does not exist in the list");
		}
		if(list.contains(myOwnClassObj))
		{
			System.out.println("myOwnClassObj exists in the list");
		}
		else
		{
			System.out.println("myOwnClassObj does not exist in the list");
		}
	//	MyNewClass myNewObj = new MyNewClass();
		if(list.contains("myNewObj"))
		{
			System.out.println("myNewObj exists in the list");
		}
		else
		{
			System.out.println("myNewObj does not exist in the list");
		}
	
			
			
}
}
