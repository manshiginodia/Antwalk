package pfive;
// thread synchronisation
class Callee{
    //three ways of synchronization
    //1. function synchronization
    //2. object synchronization
    //3. code block synchronization
    synchronized void ShoutOut(String msg)  { //-->function synchronization
        System.out.print("["+msg);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("]");
    }//scope of shoutout ends here
}

// code block synchronization
//    void ShoutOut(String msg) {
//        synchronized (this) {
//            System.out.print("[" + msg);
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.print("]");
//        }
//    }
//}
class Caller extends Thread{
    String message;
    Callee callee;

    Caller(String m, Callee c){
        message =m;
        callee=c;
    }
    @Override
    public void run() {
        callee.ShoutOut(message);
    }

//    -->object synchronization
//    public void run() {
//      synchronized (callee){
//        callee.ShoutOut(message);
//    }
//    }
}
public class TestApp {
    public static void main(String[] args) {
        Callee commonobj = new Callee();
        Caller manshi = new Caller("hi",commonobj);
        Caller mack = new Caller("to",commonobj);
        Caller jack = new Caller("java",commonobj);

        manshi.start();
        mack.start();
        jack.start();
    }
}
