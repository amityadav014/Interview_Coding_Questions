import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee2Imp {

  public static void main(String args[]) {
    List<Employee2> em = new ArrayList<Employee2>();
    Employee2 e1 = new Employee2("abc", 21, 10000);
    Employee2 e2 = new Employee2("abc", 26, 12000);
    Employee2 e3 = new Employee2("abc", 28, 15000);
    Employee2 e4 = new Employee2("abc", 22, 19000);
    Employee2 e5 = new Employee2("abc", 23, 17000);

    em.add(e1);
    em.add(e2);
    em.add(e3);
    em.add(e4);
    em.add(e5);

    //increment salary by 10% whose age is greated than 25
    List<Employee2> incrementSalary = em.stream().map(e -> {
      if (e.getAge() > 25) {
        e.setSalary(e.getSalary()*1.10);
      }
      return e;
    }).collect(Collectors.toList());

    System.out.println("original data!");
    System.out.println(em);
    System.out.println("Incrementd data!!");
    System.out.println(incrementSalary);

  }

}
