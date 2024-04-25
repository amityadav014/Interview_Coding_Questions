import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientImp {
  public static void main(String[] args){

    Patient p1=new Patient("p1", 20 , "Crona", 18000);
    Patient p2=new Patient("p2", 26 , "fever", 18000);
    Patient p3=new Patient("p3", 29 , "Crona", 8000);
    Patient p4=new Patient("p4", 23 , "Crona", 12000);

    //print all patient who have crona
    List<Patient> patients= Arrays.asList(p1,p2,p3,p4);
  //  patients.stream().filter(p->p.getDiesese().equals("Crona")).forEach(System.out::println);

    //print all patient who have crona and age greater than 25
  //  patients.stream().filter(p->p.getDiesese().equals("Crona") && p.getAge()<25 ).forEach(System.out::println);

   //find agerage billing for crona patients
    Double d= patients.stream().filter(p->p.getDiesese().equals("Crona"))
            .collect(Collectors.averagingDouble(Patient::getAmount));
    System.out.println(d);

  }
}
