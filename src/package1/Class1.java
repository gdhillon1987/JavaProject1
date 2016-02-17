package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class Class1 {

	int b = 0;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
           
           SortArray obj1 = new SortArray();
           
  // to check if an object already exist.     
       //    ob.b++;
       //    System.out.println(obj1.c);
           System.out.println(obj1);
      
       //    SortArray obj2 = new SortArray();
       //    System.out.println(obj2.c);
       //     System.out.println(obj2);
        
 // to sort an array          
    int [] intArray = {10,12,3,1,99,44};
    obj1.getArray(intArray);
  //Create an object of class List and call the exercise1 method  
    	List listObj = new List();
    	listObj.exercise1();
    	
    	//Create an object of LinkedListClass class and call exercise2 method
    	LinkedListClass lListObj = new LinkedListClass();
    	lListObj.exercise2();
    }
}
