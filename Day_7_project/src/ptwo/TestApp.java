package ptwo;

//wrappers

public class TestApp {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);

        //Explicit Boxing --> wrapping up primitive into its class object representation
        //Converting value type info into reference type info
        Integer numobj = new Integer(num);

        //explicit unboxing --> converting reference type int value type
        System.out.println(numobj.intValue());

        int numone = Integer.parseInt(args[0]);
        int numtwo = Integer.parseInt(args[1]);
        int result = numone +numtwo;
        System.out.println("sum is "+result);


    }
}
