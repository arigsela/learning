/*package whatever //do not write package name here */

import java.io.*;
import java.util.List;
import java.util.Arrays;

class Main {
	public static void main (String[] args) {
	    // Merge 2 ArrayStoreException
	    // Questions to ask:
	    // are both arrays the same size? 
	    // are they int or long or what size limit per item?
	    // Do I need to validate if its a Number
	    
      /*
	    int[] arr1 = {1,2,4};
	    int[] arr2 = {1,3,5,9};
	    System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
	    
	    int[] arr3 = {};
	    int[] arr4 = {1,3,5,9};
	    System.out.println(Arrays.toString(mergeArrays(arr3,arr4)));
	
	    int[] arr5 = {};
	    int[] arr6 = {};
	    System.out.println(Arrays.toString(mergeArrays(arr5,arr6)));
      */

      int[] arr1 = {2,1,5,1,3,2};
      int k1 = 3;
      System.out.println(getMaximumSum(arr1, k1));

	    
	}
	
  public static int getMaximumSum(int[] arr, int k) {
    int totalSum = 0;
    int winSum = 0;
    int winStart = 0;

    for (int winEnd = 0; winEnd < arr.length; winEnd++) {
      winSum+=arr[winEnd];

      if (winEnd >= k -1) {
        totalSum = Math.max(totalSum, winSum);
        winSum-=arr[winStart];
        winStart++;
      }
    }
  
    return totalSum;
  }

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
	    // create mergeArray
	    // loop trough arr1 and check if any value of arr2 is smaller or equal to store in mergeArray n^2
        // merge all items and then sort but since its already sorted it doesnt make sense
        // You could use the 2 pointer method to keep track of each array items
        
        // Get sizes of both Arrays
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
    
        if (arr1Size == 0) {
            return arr2;
        } else if (arr2Size == 0) {
            return arr1;
        } else if (arr1Size == 0 && arr2Size == 0) {
            return null;
        }
    
        // Create mergeArray with size of both
        int[] mergeArray = new int[arr1Size + arr2Size];
        
        //Iterate through mergeArray size to populate values
        int p1 = 0;
        int p2 = 0;
        int i=0;
        
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
               mergeArray[i++] = arr1[p1++];
               mergeArray[i++] = arr2[p2++];
               
            }
            else if (arr1[p1] > arr2[p2]) {
                mergeArray[i++] = arr2[p2++];
            } else {
                mergeArray[i++] = arr1[p1++];
            }
        }
        if (p1 < arr1.length) {
            for (int j =p1; i < arr1.length; j++) {
               mergeArray[i++] = arr1[j];
            }
        } else {
            for (int j = p2; j < arr2.length; j++) {
                System.out.println("j=" + j + " i=" + i);
                mergeArray[i++] = arr2[j];
            }
        }
        
        return mergeArray;
	}
}