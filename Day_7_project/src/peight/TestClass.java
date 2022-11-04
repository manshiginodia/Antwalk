package peight;

//built in functional interfaces

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {
    public static void main(String[] args) {

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s == "mini"){
                    return true;
                }
                else{
                    return false;
                }

            }
        };

        /* or in lambda
        Predicate<String> predicate = (s) ->{
                if(s == "mini"){
                    return true;
                }
                else{
                    return false;
                }
        };

         */
        boolean status = predicate.test("mini");
        System.out.println(status);


        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("This info is "+s);
            }
        };
        consumer.accept("Manshi Ginodia");

        /*
        or
        Consumer<String> consumer = ( s) -> System.out.println("This info is"+s);
        };

         */



        Supplier<Double> supplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return 3.14;
            }
        };
        System.out.println("PI value is "+supplier.get());


        Function<String , String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        };
        String info = function.apply("man");
        System.out.println(info);
    }
}


/*
1. Predicate FI - testing
2. Consumer FI - takes input of one type no output
3. Supplier FI - returns but does not take input
4. Function FI - takes 2 parameter one for input and other output takes input operates on it and returns

class Animal{
}
class Avian{
}
class Reptile{
}
class mammal{
}

ArrayList<T extends Animal> ---> T: Generic type parameter

//generic type parameter is compile time parameter

ArrayList<? extends Animal> ---> ?: wild card type parameter

? can be replaced by the reference of Animal class as well as its child classes
 but when we write T extends animal it can only be replaced by references of Animal
? gives a dynamic nature.

 */