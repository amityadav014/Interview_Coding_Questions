//ArraySorting

public class ArraySorting {

  public static void bubbleSort(int[] array) {
    int n = array.length;
    boolean swapped;

    do {
      swapped = false;
      for (int i = 1; i < n; i++) {
        if (array[i - 1] > array[i]) {
          // Swap elements if they are in the wrong order
          int temp = array[i - 1];
          array[i - 1] = array[i];
          array[i] = temp;
          swapped = true;
        }
      }
      // After each pass, the largest element is correctly placed at the end, so reduce the array size
      n--;
    } while (swapped);
  }

  public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 5, 6};

    // Sorting the array using Bubble Sort
    bubbleSort(numbers);

    System.out.println("Sorted Array in Ascending Order:");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }
}
