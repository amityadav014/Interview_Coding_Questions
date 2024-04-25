public class StringCompare {
  public static void main(String args[])
  {
    String str1="abc";
    String str2="abc";
    String str3=new String("abc");

    //true
    System.out.println(str1==str2);
    //false
    System.out.println(str1==str3);
    //true
    System.out.println(str1.equals(str3));
  }
}
