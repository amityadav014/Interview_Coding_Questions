import java.util.Arrays;
import java.util.List;

public class HighestNum {
  public static void main(String args[]){
    List<Integer> ht= Arrays.asList(9,4,66,2,3,77,8);
    //heighest number
   Integer h= ht.stream().max((i,j)->i.compareTo(j)).get();
   System.out.println(h);
  }
}
