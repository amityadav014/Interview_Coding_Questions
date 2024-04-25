public class FindSpecialCharacter {
  public static void main(String args[]) {
    //count special char
    String s = "cloudTech#$%";
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
              && !Character.isWhitespace(s.charAt(i))) {
        count++;
      }
    }
    if (count == 0) {
      System.out.println("there are no specia; char");

    }else{
      System.out.println("no of specia char"+count);
    }
  }
}
