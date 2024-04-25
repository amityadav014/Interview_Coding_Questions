public class ReverseNumber {
  public static void main(String ars[]){
    int n=1325;
    int rev=0;
    while(n!=0){
      int reminder=n%10;
      rev=rev*10+reminder;
      n=n/10;

    }
    System.out.println(rev);
  }
}
