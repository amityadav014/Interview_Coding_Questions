import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Product1Imp2 {
  public static void main(String args[]) {
    Product1 p1 = new Product1(101, "java", "books", 150);
    Product1 p2 = new Product1(102, "html", "books", 300);
    Product1 p3 = new Product1(103, "css", "books", 400);
    Product1 p4 = new Product1(104, "nokia", "phone", 100);
    Product1 p5 = new Product1(105, "dell", "phone", 150);

    //get the cheapest product of "phone" category using java 8?
    List<Product1> product= Arrays.asList(p1,p2,p3,p4,p5);
    Product1 cheapestProduct = product.stream().filter(p->p.getCategory().equalsIgnoreCase("phone"))
            .min(Comparator.comparing(Product1::getPrice)).get();
  System.out.println(cheapestProduct);
  }
  }
