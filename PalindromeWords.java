import java.util.Arrays;
import java.util.List;

public class PalindromeWords {
  public static void main(String args[]){
    // print all palindrome words from list of string values
List<String> strings= Arrays.asList("ab","aba","xyx","mno","xyz","pop");
strings.stream().filter(x->x.length()>0 && x.endsWith(String.valueOf(x.charAt(0))))
        .forEach(System.out::println);
  }
}
