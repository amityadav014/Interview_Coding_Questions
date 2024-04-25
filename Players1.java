public class Players1 {
  private String name;
  private int score;
  private String type;

  public Players1(String name, int score, String type) {
    this.name = name;
    this.score = score;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Players1{" +
            "name='" + name + '\'' +
            ", score=" + score +
            ", type='" + type + '\'' +
            '}';
  }
}
