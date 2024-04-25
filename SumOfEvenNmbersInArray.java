import java.util.Arrays;

public class SumOfEvenNmbersInArray {
  public static void main(String args[]){
    int num[]={1,2,3,4,5,6,7,8,9};

    //sum of even numbers
    int sum= Arrays.stream(num).filter(n->n%2==0).sum();
    System.out.println("sum of even is: "+sum);

  }
}
