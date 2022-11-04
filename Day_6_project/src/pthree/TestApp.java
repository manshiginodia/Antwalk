package pthree;
// TROW THROWS FINALLY
import java.io.IOException;

class InsufficientFund extends Exception{
    void myOwnPrintTrackTrace(){
        System.out.println("Insufficient balance in your ac, operation declined");
    }
}

public class TestApp {
    public static void main(String[] args) throws InsufficientFund, IOException {
        try{
            throw new InsufficientFund();
        }catch(InsufficientFund ex){
            ex.printStackTrace();
        }finally{
            System.out.println("will execute at any cost");
        }
        System.out.println("continue further");
    }
}
