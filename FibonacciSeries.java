// FibonacciSeries


public class FibonacciSeries {

  public static void main(String[] args) {
    int n = 10; // Number of Fibonacci numbers to generate
    generateFibonacciSeries(n);
  }

  public static void generateFibonacciSeries(int n) {
    int firstNum = 0;
    int secondNum = 1;

    System.out.println("Fibonacci Series:");
    System.out.print(firstNum + " " + secondNum + " ");

    for (int i = 2; i < n; i++) {
      int nextNum = firstNum + secondNum;
      System.out.print(nextNum + " ");

      firstNum = secondNum;
      secondNum = nextNum;
    }
  }
}
