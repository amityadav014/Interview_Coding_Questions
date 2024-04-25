import java.util.Arrays;

public class CompareTwoArray {
  public static void main(String args[]) {
    int arr1[] = {1, 2, 3, 4};
    int arr2[] = {4, 3, 2, 1};
    if (areEquals(arr1, arr2)) {
      System.out.println("both arrays are equals");
    }
  }

  public static boolean areEquals(int[] arr1, int[] arr2) {
    int n = arr1.length;
    int m = arr2.length;

    if (n != m) {
      return false;
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for (int i = 0; i < n; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }
   return true;
  }
}
