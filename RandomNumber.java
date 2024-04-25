import java.util.Random;

public class RandomNumber {
  public static void main(String args[]){
    Random random=new Random();

    //LARGE RANDOM NUMBER
    random.ints().limit(10).forEach(System.out::println);
    //SMALL RANDOM NUMBER
    random.ints(1,100).limit(5).forEach(System.out::println);


  }
}
