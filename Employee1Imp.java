import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
public class Employee1Imp {
  public static void main(String[] args) {

    List<Employee1> employees = new ArrayList<Employee1>();
    employees.add(new Employee1("ABC", 30, "FEMALE", "HR"));
    employees.add(new Employee1("PQR", 25, "MALE", "IT"));
    employees.add(new Employee1("LMN", 30, "MALE", "HR"));
    employees.add(new Employee1("XYZ", 30, "FEMALE", "IT"));

    //print all disctinct departments   output= HR, IT
   // employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

    //print count of employees in each department     output= {HR=2, IT=2}
    Map<String,Long> employeeCount=employees.stream()
    .collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
    System.out.println(employeeCount);

    // print avgerage age og male and female            output= {MALE=27.5, FEMALE=30.0}
    Map<String, Double> avgAge=employees.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
    System.out.println(avgAge);



}
}
