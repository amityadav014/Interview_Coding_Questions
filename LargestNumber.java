import java.util.Arrays;

public class LargestNumber {
  public static void main(String args[]){
    int arr[]={10,20,40,30,60,50};
    Arrays.sort(arr);
    System.out.println(arr[arr.length-1]);
  }
}
