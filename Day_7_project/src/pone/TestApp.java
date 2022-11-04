package pone;

//co-variant return types
class Employee {
    Employee Show() {
        System.out.println("show method of employee");
        return new Employee();
    }
}

class ITEmployee extends Employee{
    ITEmployee Show(){
        System.out.println("show inheritance from employee parent");
        return new ITEmployee();
    }

}
public class TestApp {
    public static void main(String[] args) {

    }
}
