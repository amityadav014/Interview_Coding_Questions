public class Patient {
  private String name;
  private int age;
  private String diesese;
  private int amount;

  public Patient(String name, int age, String diesese, int amount) {
    this.name = name;
    this.age = age;
    this.diesese = diesese;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDiesese() {
    return diesese;
  }

  public void setDiesese(String diesese) {
    this.diesese = diesese;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Patient{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", diesese='" + diesese + '\'' +
            ", amount=" + amount +
            '}';
  }
}
