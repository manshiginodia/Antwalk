package pone;

//Method Reference
class Employee{
    static void performtask(){
        System.out.println("Employee performing task");
    }
    void anytask(){
        System.out.println("employee performing any tak");
    }
}


@FunctionalInterface
interface MySample{
    void doTask();
}

@FunctionalInterface
interface MyFactory{
    Employee getEmployee();
}


public class TestApp {
    public static void main(String[] args) {
        /*
        MySample mySample = new MySample() {
            @Override
            public void doTask() {
                System.out.println("do task got body");
            }
        };
         */


        /*
        MySample mySample = () ->System.out.println("do task got body");
            }
        };
         */


        //1. Static method Reference
        // Syntax: className::methodName

        MySample mySample = Employee::performtask;
        mySample.doTask();

        //2. Instance method referance
        //MySample mySample1 = new Employee()::performtask // shows error it is static
        Employee empobj = new Employee();
        MySample mySample1 =empobj::anytask;

        MyFactory myFactory=new MyFactory() {
            @Override
            public Employee getEmployee() {
                return new Employee();
            }
        };

        Employee emponeobj=myFactory.getEmployee();
        System.out.println("Functional interface getemployee returning Employee obj reference");
        myFactory.getEmployee().anytask();

        System.out.println("constructor method reference");
        MyFactory myFactory1= Employee::new;
        myFactory1.getEmployee().anytask();

    }

}
