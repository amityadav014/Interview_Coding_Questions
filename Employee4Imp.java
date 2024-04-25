import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee4Imp {
  public static void main(String args[]){
List<Employee4> emp= Arrays.asList(
        new Employee4("emp1","cs",1000),
        new Employee4("emp2","mec",20000),
        new Employee4("emp3","ece",30000),
        new Employee4("emp4","it",550000),
        new Employee4("emp5","cs",330000),
        new Employee4("emp6","it",220000)
        );

Map<String, List<Employee4>> byDepartment=emp.stream()
        .collect(Collectors.groupingBy(e->e.getDepartment()));

System.out.println(byDepartment);
  }
}
