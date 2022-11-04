package pfour;

//MULTI-THREADING
//NEED OF MULTI THREADING

class Employee extends Thread{
    String ename;
    public Employee(String ename){
        this.ename =ename;
    }

//    public void DoSomeTask(){
//        for (int start =0; start<=10;start++){
//            System.out.println(ename+" prints "+start);
//        }
//    }

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
        //here task is dependent the task for obj 2 starts only after completion of task 1 and each of these tasks are known as threads
//        here the empone and emptwo are non threading object
//        empone.DoSomeTask();
//        emptwo.DoSomeTask();
        empone.start();
        emptwo.start();

        //primary threaded object
        for (int start =0; start<=10;start++){
            System.out.println("Main prints "+start);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}