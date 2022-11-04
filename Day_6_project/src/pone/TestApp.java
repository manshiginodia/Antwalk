package pone;

//need of exception handling
public class TestApp {
    public static void main(String[] args) {
        System.out.println("Please enter the value from cmd");

        try {
            System.out.println(args[0]); //jvm makes a new Aiox(0;
        }catch(Exception stackvar){
            System.out.println("Please pass cmd param to see the cmp param info");
            stackvar.printStackTrace();
        }
        System.out.println("code continues further");
    }
}
