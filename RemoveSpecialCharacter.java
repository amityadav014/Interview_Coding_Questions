public class RemoveSpecialCharacter {
  public static void main(String args[]) {

        String s = "cloudTech#$%";
        String removesplchar="";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
          if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
                  && !Character.isWhitespace(s.charAt(i))) {
            count++;
          }else{
            removesplchar=removesplchar+s.charAt(i);
          }
        }
        System.out.println(removesplchar);

        if (count == 0) {
          System.out.println("there are no specia; char");

        }else{
          System.out.println("no of specia char"+count);
        }
      }
    }


