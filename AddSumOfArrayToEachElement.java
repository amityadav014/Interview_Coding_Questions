import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddSumOfArrayToEachElement {
  public static void main(String args[]){
    List<Integer> num= Arrays.asList(10,20,30,40,50);
     //add sum of array to each element
    Integer sum=num.stream().reduce(0,Integer::sum);
    List<Integer>  addedlist=num.stream().map(x->x+sum)
            .collect(Collectors.toList());
     System.out.print(addedlist);
  }
}
