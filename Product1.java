public class Product1 {
  private Integer id;
  private String name;
  private String category;
  private Integer price;

  public Product1(Integer id, String name, String category, Integer price) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product1{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", category='" + category + '\'' +
            ", price=" + price +
            '}';
  }
}
