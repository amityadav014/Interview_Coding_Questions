import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordByLength {
  public static void main(String args[]){
    List<String> word= Arrays.asList("i","am","here","java","is","good","programming","language");
    //java program to group the words by using java 8?
 Map<Integer,List<String>> lengthWord=word.stream().collect(Collectors.groupingBy(String::length));
 System.out.println(lengthWord);

  }
}
