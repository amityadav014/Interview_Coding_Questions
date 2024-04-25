import java.util.List;

public class Team1 {
  private List<Players1> players;
  public int getScore(){
    if(players!=null){
      return players.stream().mapToInt(p->p.getScore()).reduce(0,(a,b)->a+b);
    }
    return 0;
  }

  public List<Players1> getPlayers() {
    return players;
  }

  public void setPlayers(List<Players1> players) {
    this.players = players;
  }
}
