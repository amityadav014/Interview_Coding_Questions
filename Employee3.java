public class Employee3 {
  private String name;
  private String city;

  public Employee3(String name, String city) {
    this.name = name;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Employee3{" +
            "name='" + name + '\'' +
            ", city='" + city + '\'' +
            '}';
  }
}

