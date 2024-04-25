import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords {
  public static void main(String args[]){

    List<String> s= Arrays.asList("AA","BB","AA","CC","DD","WW","BB","NN","MM","CC");
    //find frequency of each word in the given list and print only those words which are having count>=2
    Map<String, Long> wordCount=s.stream().filter(w-> Collections.frequency(s,w)>1)
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    System.out.println(wordCount);

  }
}
