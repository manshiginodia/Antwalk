package ptwo;

//multiple catch in single try

//INCOMPLETE SS IN WORD

public class TestApp {
    public static void main(String[] args) {
        System.out.println("Please enter the value from cmd");

        try {
            System.out.println(args[0]); //jvm makes a new Aiox(0;
            int num =20;
            int denom= 10;
            int result =num/denom;
            System.out.println("result of division "+result);

        } catch (Exception stackvar) {
            System.out.println("Please pass cmd param to see the cmp param info");
            stackvar.printStackTrace();
        }
        System.out.println("code continues further");
    }
}