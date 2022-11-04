package pfour;
//tostring method of Object class
class Employee{
    String empname;
    double empsalary;
    int yoj;

    public Employee(String empname, double empsalary, int yoj) {
        this.empname = empname;
        this.empsalary = empsalary;
        this.yoj = yoj;
    }

    @Override
    public String toString() {
        return empname+" "+empsalary+" "+yoj;
    }
}
public class TestApp {
    public static void main(String[] args) {
        Employee empobj = new Employee("Manshi", 5098, 2011);
        System.out.println(empobj);
    }

}
