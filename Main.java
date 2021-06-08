/*package whatever //do not write package name here */

import java.io.*;
import java.util.List;
import java.util.Arrays;

class Main {
	public static void main (String[] args) {
	    
      /*
      int number = 3;
      System.out.println(findFactorialRecursive(number));
      System.out.println(findFactorialIterative(number));

      number = 100;
      System.out.println(findFactorialRecursive(number));
      System.out.println(findFactorialIterative(number));
      */

      int number = 3;
      //0 1 1 2 3 = 3
      System.out.println(fibonacciRecursive(number));
      System.out.println(fibonacciIterative(number));
	}

public static int fibonacciIterative(int n) { //O(n)
  int[] arr = {0,1};

  for (int i = 2; i < n; i++) {
      arr[i] = arr[i-2] + arr[i-1];
  }

  return arr[n-1];
}

public static int fibonacciRecursive(int n) { //O()
  if (n < 2) {
    return n;
  }

  return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
}


  public static int findFactorialRecursive(int number) {

    //identify base case where we return the initial value
    if (number == 2) {
      return 2;
    }

    // make sure to return the functionality we need (in this case the multiplication)
    return number * findFactorialRecursive(number-1);
  }

  public static int findFactorialIterative(int number) {
    int result = 1;

    for (int i = number; i > 0; i--) {
      result=result*i;
    }
    return result;
  }
	
}