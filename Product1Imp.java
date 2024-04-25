import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product1Imp {
  public static void main(String args[]){
    Product1 p1=new Product1(101,"java","books",150);
    Product1 p2=new Product1(102,"html","books",300);
    Product1 p3=new Product1(103,"css","books",400);
    Product1 p4=new Product1(104,"nokia","phone",100);
    Product1 p5=new Product1(105,"dell","phone",150);

    //get the list of all products that belongs to books category and product price>200 using java 8?
    List<Product1> product= Arrays.asList(p1,p2,p3,p4,p5);
    product.stream().filter(p->p.getCategory().equalsIgnoreCase("books")).filter(p->p.getPrice()>200)
            .collect(Collectors.toList()).forEach(System.out::println);

  }
}
