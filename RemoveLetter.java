public class RemoveLetter {
  public static void main(String args[]){
    String str="tatananocar";
    char c='a';
    String str2="";
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)!=c){
        str2=str2+str.charAt(i);
      }
    }
    System.out.println(str2);
  }
}
