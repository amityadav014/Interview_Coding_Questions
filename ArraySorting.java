//ArraySorting

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {


  public static void main(String[] args) {

    int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
    System.out.println("Array elements after sorting:");
    //sorting logic
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = i + 1; j < arr.length; j++)
      {
        int tmp = 0;
        if (arr[i] > arr[j])
        {
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
     //prints the sorted element of the array
      System.out.println(arr[i]);

    }
    //method 2
    int[] a = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78};
// sorts subarray form index 2 to 7
    Arrays.sort(a, 2, 7);
//prints array using the for loop
    for (int i = 0; i < a.length; i++)
    {
      System.out.println(a[i]);
    }

    //method
    String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
    Arrays.sort(strarray, Collections.reverseOrder());
    System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
  }
}
}
