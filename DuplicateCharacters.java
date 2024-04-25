import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharacters {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    //take input string from user and find duplicate characters in the given string?
    HashSet<Character> charSet=new HashSet<>();
    for(char c: str.toCharArray()){
      if(charSet.contains(c)){
        System.out.print(c+" ");
      }else{
        charSet.add(c);
      }
    }
  }
}
