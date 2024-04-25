 import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumber {
  public static void main(String args[]){
    List<Integer> no= Arrays.asList(10,20,30,40,50,20,60,10);
    //find duplicate nuber
    Set<Integer> s=new HashSet<>();
    no.stream().filter(num->!s.add(num)).forEach(System.out::println);

  }
}
