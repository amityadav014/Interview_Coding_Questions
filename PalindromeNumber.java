// PalindromeNumber java


public class PalindromeNumber {

  public static boolean isPalindrome(int number) {
    int originalNumber = number;
    int reversedNumber = 0;

    while (number > 0) {
      int digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number = number / 10;
    }

    return originalNumber == reversedNumber;
  }

  public static void main(String[] args) {
    int num1 = 121;
    int num2 = 12321;

    System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
    System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));
  }
}
