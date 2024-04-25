import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperLetter {
  public static void main(String args[])
  {
    List<String> s= Arrays.asList("india","nepal","bhutan");
    // convert to upper case
   List<String> s2= s.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
   System.out.println(s2);

  }
}
