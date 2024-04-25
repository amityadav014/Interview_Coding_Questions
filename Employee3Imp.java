import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee3Imp {
  public static void main(String args[]){
    Employee3 e1=new Employee3("amar","pune");

    Employee3 e3=new Employee3("raj","delhi");
    Employee3 e2=new Employee3("himanshu","pune");
    Employee3 e4=new Employee3("sanu","delhi");

    List<Employee3> emp= Arrays.asList(e1,e2,e3,e4);
    Map<String , List<Employee3>> groupByCity=emp.stream()
            .collect(Collectors.groupingBy(Employee3::getCity));

    System.out.println(groupByCity);
  }
}
