package pseven;
//runnable and join
class Sample{

}

class Employee extends Sample implements Runnable{
    String ename;
    public Employee(String ename){
        this.ename =ename;
    }


    public void run(){
        for (int start =0; start<=10;start++){
            System.out.println(ename+" prints "+start);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class TestApp {
    public static void main(String[] args) {
        //secondary threaded object
        Employee empone=new Employee("rohan");
        Employee emptwo=new Employee("mack");

        Thread t1 = new Thread(empone);
        Thread t2 = new Thread(emptwo);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        for (int start =0; start<=10;start++) {
            System.out.println("Main prints " + start);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}