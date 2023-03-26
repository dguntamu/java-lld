package java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmpComparator {
    public static void main(String[] args) {
        List<Emp> emps = Arrays.asList(
                new Emp(1,"emp1",1000),
                new Emp(2,"emp1",3000),
                new Emp(3,"emp1",5000),
                new Emp(4,"emp1",11000),
                new Emp(5,"emp1",20000)
        );

        //List<Emp> sortedEmps = emps.stream()
          //      .sorted((a,b) -> {return a.getSalary()-b.getSalary();}).collect(Collectors.toList());

        //List<Emp> sortedEmps = emps.stream().sorted(Comparator.comparing(Emp::getSalary).reversed()).collect(Collectors.toList());
        //List<Emp> sortedEmps = emps.stream().sorted(Comparator.comparing(Emp::getSalary)).collect(Collectors.toList());
        List<Emp> sortedEmps = emps.stream().sorted(Comparator.comparing(Emp::getEmpName)).collect(Collectors.toList());
        sortedEmps.forEach(emp -> System.out.println(emp.getEmpName()));
    }
}
class Emp{
    private int empId;
    private String empName;
    private double salary;

    public Emp(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}