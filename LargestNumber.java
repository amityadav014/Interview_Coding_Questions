//How To Find Largest Number Less Than Given Number And Without Given Digit?

public class LargestNumber
{
  static int getLLessThanN(int number, int digit)
  {
    //Converting digit to char
    char c = Integer.toString(digit).charAt(0);

    //Decrementing number & checking whether it contains digit
    for (int i = number; i > 0; --i)
    {
     // System.out.println(Integer.toString(i)+"  kkkk "+Integer.toString(i).indexOf(c));
      if(Integer.toString(i).indexOf(c) == -1)
      {
        //If 'i' doesn't contain 'c'
      // System.out.println(" lll print i : "+i);
        return i;
      }
    }
    System.out.println(" ppp print ");
    return -1;
  }
  public static void main(String[] args)
  {
    //getLLessThanN(123, 2);
    System.out.println(getLLessThanN(123, 2));

//    System.out.println(getLLessThanN(4582, 5));
//
//    System.out.println(getLLessThanN(98512, 5));
//
//    System.out.println(getLLessThanN(548624, 8));
  }
}