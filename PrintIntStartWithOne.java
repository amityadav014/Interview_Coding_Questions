import java.util.Arrays;
import java.util.List;

public class PrintIntStartWithOne {
  public static void main(String args[]){
    List<Integer> num= Arrays.asList(10,12,50,30,18,19);
    num.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
  }
}
