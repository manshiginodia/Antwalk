package psix;
//inter thread communication - wait() and notify() method from object class
//wait and notify are non static so we need to create an object for them
class Tortoise extends Thread{
    int oddNum =1;

    Object obj;
    Tortoise(Object obj){
        this.obj =obj;
    }
    @Override
    public void run() {
        for (int start =0; start<=10; start++){

            synchronized (obj){
                System.out.println("Tortoise prints "+oddNum);
                oddNum=oddNum+2;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                try {
                    obj.wait();
                    obj.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
class Rabbit extends Thread{
    int evenNum =2;

    Object obj;
    Rabbit(Object obj){
        this.obj =obj;
    }

    @Override
    public void run() {
        for (int start =0; start<=10; start++){
            synchronized (obj){
                System.out.println("Rabbit prints "+evenNum);
                evenNum=evenNum+2;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    obj.notify();
                    obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
public class TestApp {
    public static void main(String[] args) {

        Object obj =new Object();
        Tortoise tobj = new Tortoise(obj);
        Rabbit robj = new Rabbit(obj);

        tobj.start();
        robj.start();

    }
}
