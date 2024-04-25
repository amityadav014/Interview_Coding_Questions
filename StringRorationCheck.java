public class StringRorationCheck {
  public static void main(String args[])
  {
    String str1="TATANANO";
    String str2="NANOTATA";

    if(str1.length()!=str2.length()){
      System.out.println("string 2 ia not rotation of string 1");
    }else{
      str1=str1+str1;
      if(str1.indexOf(str2)!=-1){
        System.out.println("string 2 is rotation of string 1");
      }else{
        System.out.println("string 2 is not rotation of string 1");
      }
    }
  }
}
