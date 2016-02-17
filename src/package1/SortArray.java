
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.ArrayList;
import java.util.Arrays;


public class SortArray 
{
 static int c = 1;
    public SortArray()
    {
        if(c<2)
       {
        c++; 
       }
        else
        {
            System.out.println("Object already created. New object not created.");
            System.exit(0);
        }
    }
    
  
  protected void getArray(int intArray[])
  {
    System.out.println("****** Unsorted String Array *******");
    for (int arr : intArray) 
    {
    System.out.println(arr);
    }
    
    System.out.println();
    System.out.println("****** Sorted String Array *******");
    Arrays.sort(intArray);
    for (int arr : intArray) 
    {
    System.out.println(arr);
    }
  }
}

