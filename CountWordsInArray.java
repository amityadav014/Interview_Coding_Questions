import java.util.Arrays;
import java.util.List;

public class CountWordsInArray {
  public static void main(String args[]){
    List<String> word= Arrays.asList("apple","banana","apple","orange","mango");
    //count apple in list
    long count=word.stream().filter(w->w.equals("apple")).count();
    System.out.println(count);
  }
}
