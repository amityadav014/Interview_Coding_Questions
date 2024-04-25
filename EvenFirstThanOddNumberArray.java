import java.util.ArrayList;

public class EvenFirstThanOddNumberArray {
  public static void main(String args[]) {
 int arr[]={2,3,4,5,4,6,7,5,44,99,88};
 // System.out.println(evenThenOdd(arr));
    evenThenOdd(arr);
  }

  public static ArrayList evenThenOdd(int[] array) {
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        even.add(array[i]);
      } else {
        odd.add(array[i]);
      }
    }

    even.addAll(odd);
   System.out.println(even);
    return even;
  }
}
