package package1;

import java.util.HashMap;

public class MapClass 
{
	protected void exercise4()
	{
		
		MyOwnClass myOwnClassObj1 = new MyOwnClass();
		MyOwnClass myOwnClassObj2 = new MyOwnClass();
		
		HashMap hm = new HashMap();
	
/*	
	1. Create your own HashMap object 
	2. Add the following objects to the newly created HashMap object.
 		a. String objects with key/value pairs "1st"/"Hello", "2nd"/"Goodbye"
		b. MyOwnClass objects with keys "3rd", "4th" - using your instances of MyOwnClass objects
		c. Integer objects with keys "5th"/ 56 
*/	
		System.out.println();
		System.out.println("----------------------------------------HASH MAP---------------------------------------");
			
		hm.put("1st", "Hello");
		hm.put("2nd", "Goodbye");
		hm.put("3rd", myOwnClassObj1);
		hm.put("4th", myOwnClassObj2);
		hm.put("5th", 56);
		
	//3. Display only keys from the HashMap created	
		System.out.println("Hashmap has keys :   " +hm.keySet());
		
	//4. Display only values from the Hashmap created	
		System.out.println("Hashmap has values :   " +hm.values());
		
	//5. Display both key/values from the Hashmap created
		System.out.println("Hashmap has entries :   " +hm.entrySet());
		
		
	}
}
