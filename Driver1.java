import java.util.ArrayList;
import java.util.List;

public class Driver1 {
  public static void main(String args[]){
    Players1 p1=new Players1("raj",60,"batsman");
    Players1 p2=new Players1("karan",40,"batsman");
    Players1 p3=new Players1("dhoni",20,"batsman");

    List<Players1> player=new ArrayList<Players1>();
    player.add(p1);
    player.add(p2);
    player.add(p3);
    Team1 kkr=new Team1();
    kkr.setPlayers(player);
    int totalscore=kkr.getScore();
    System.out.println("total score :"+totalscore);

  }
}
