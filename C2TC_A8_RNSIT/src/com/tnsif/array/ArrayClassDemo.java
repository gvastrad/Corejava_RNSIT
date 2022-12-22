//Program to Demonstrate Arrays Class
package com.tnsif.array;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To convert the elements as List
		System.out.println("Integer Array as List: " + Arrays.asList(intArr));
		
		Arrays.sort(intArr);
		  
        int intKey = 22;
  
        // Print the key and corresponding index
        System.out.println(
            intKey + " found at index = "
            + Arrays.binarySearch(intArr, intKey));
    
        System.out.println(
                intKey
                + " found at index = "
                + Arrays
                      .binarySearch(intArr, 1, 3, intKey));
        
        // Get the second Array
        int intArr1[] = { 10, 15, 22 };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compare(intArr, intArr1));
        
     // To print the elements in one line
        System.out.println("Integer Array: "
                           + Arrays.toString(intArr));
  
        System.out.println("\nNew Arrays by copyOf:\n");
  
        System.out.println("Integer Array: "
                           + Arrays.toString(
                                 Arrays.copyOf(intArr, 10)));
        
        System.out.println("\nNew Arrays by copyOfRange:\n");
        
        // To copy the array into an array of new length
        System.out.println("Integer Array: "
                           + Arrays.toString(
                                 Arrays.copyOfRange(intArr, 1, 3)));
        
        Arrays.fill(intArr, intKey);
        
        // To fill the arrays
        System.out.println("Integer Array on filling: "
                           + Arrays.toString(intArr));
	
	}

}
