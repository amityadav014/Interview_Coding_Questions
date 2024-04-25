public class FindPalindromeWords {

  public static void main(String args[]) {
    //find palindrom words
    String input = "hi i am nitin and i can speak malayalam";
    String[] words = input.split(" ");
    for (String word : words) {
      if (isPalindrome(word)) {
        System.out.println(word + "   = is palindrome");
      }
    }
  }
  public static boolean isPalindrome(String input) {
    int i1 = 0;
    int i2 = input.length() - 1;
    while (i2 > i1) {
      if (input.charAt(i1) != input.charAt(i2)) {
        return false;

      }
      i1++;
      i2--;
    }
    return true;

  }
}