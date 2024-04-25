import java.util.Arrays;
import java.util.List;

public class PrintEvenNumber {
  public static void main(String srga[]){
    List<Integer> num= Arrays.asList(11,22,3,34,30,10,77);
    num.stream().filter(e->e%2==0).forEach(System.out::println);
  }
}
