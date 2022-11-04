package pfive;

//Java Bean

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    private String empname;
    private double empsalary;
    private int yoj;

    public Employee() {
        super();
    }

    public Employee(String empname, double empsalary, int yoj) {
        super();
        this.empname = empname;
        this.empsalary = empsalary;
        this.yoj = yoj;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }

    public int getYoj() {
        return yoj;
    }

    public void setYoj(int yoj) {
        this.yoj = yoj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empname='" + empname + '\'' +
                ", empsalary=" + empsalary +
                ", yoj=" + yoj +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getYoj() - employee.getYoj();
    }

}

class NameSort implements Comparator<Employee> {

    @Override
    public int compare(Employee empone, Employee emptwo) {
        return empone.getEmpname().compareTo(emptwo.getEmpname());
    }
}

class SalarySort implements Comparator<Employee>{

    @Override
    public int compare(Employee empone, Employee emptwo) {
        if(empone.getEmpsalary()<emptwo.getEmpsalary()){
            return -1;
        } else if (empone.getEmpsalary()>emptwo.getEmpsalary()) {
            return 1;
        }
        else{
            return 0;
        }
    }
}


public class TestApp {
    public static void main(String[] args) {


        ArrayList<Employee> empcol = new ArrayList<>();

        empcol.add(new Employee("Mack",50000,2011));
        empcol.add(new Employee("Manshi",59000,2010));
        empcol.add(new Employee("Mohan",10000,2019));
        empcol.add(new Employee("Manish",780000,2008));
        empcol.add(new Employee("Manisha",40000,2017));

        System.out.println("Collection of employee object before sorting ");
        //System.out.println(empcol );
        for (Employee tempobj:empcol){
            //System.out.println(tempobj);
            System.out.println(tempobj.getEmpname()+" "+tempobj.getEmpsalary()+" "+tempobj.getYoj());
        }

//comparable
        System.out.println("Collection of employee object after sorting on yoj using comparable");
        Collections.sort(empcol);
        for (Employee tempobj:empcol){
            //System.out.println(tempobj);
            System.out.println(tempobj.getEmpname()+" "+tempobj.getEmpsalary()+" "+tempobj.getYoj());
        }

//comparator
        System.out.println("Collection of employee object after sorting on name using comparator");
        NameSort nameSort = new NameSort();
        Collections.sort(empcol, nameSort);
        for (Employee tempobj:empcol){
            //System.out.println(tempobj);
            System.out.println(tempobj.getEmpname()+" "+tempobj.getEmpsalary()+" "+tempobj.getYoj());
        }


        System.out.println("Collection of employee object after sorting on salary using comparator");
        SalarySort salSort = new SalarySort();
        Collections.sort(empcol, salSort);
        for (Employee tempobj:empcol){
            //System.out.println(tempobj);
            System.out.println(tempobj.getEmpname()+" "+tempobj.getEmpsalary()+" "+tempobj.getYoj());
        }

    }

}