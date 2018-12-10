package day5;

import java.util.Arrays;

public class ArrayDem01 {

	public static void main(String[] args) {
		 int arr[] = {24,15,7,2,12};
		 
		 for(int index : arr)
		 {
			
			 System.out.print(index+" " );
		 }
		// System.out.println( "index value of given value  is: " + Arrays.binarySearch(arr,7 ));
		// System.out.println("new Array is " + Arrays.copyOf(arr, 5));
		/* Arrays.sort(arr);
		 System.out.println("New Sorted index is");
		 for(int index : arr)
		 {
			
			 System.out.print(index+" " );
		 }
		 Arrays.copyOf(arr, 5);
		 System.out.println("New copied array is");
		 for(int index2 : arr)
		 {
			
			 System.out.print(index2 + " " );
		 }*/
		 
		 Arrays.copyOfRange(arr, 2, 4);
		 System.out.println("New copied array with range is");
		 for(int index2 : arr)
		 {
			
			 System.out.print(index2 + " " );
		 }
		 
	}

}
