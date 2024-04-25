import java.util.Arrays;
import java.util.List;

public class SquareNumbers {
  public static void main(String args[]){
    List<Integer> n= Arrays.asList(2,3,4,5,6);
    n.stream().map(x->x*x).forEach(System.out::println);
  }
}
