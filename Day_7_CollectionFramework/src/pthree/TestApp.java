package pthree;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.function.BiConsumer;

public class TestApp {
    public static void main(String[] args) {
        System.out.println("semester marks details");
        //dynamic method overloading - hashmap concrete class
        Map<String, Integer> semdetail = new HashMap<>();
        semdetail.put("core java", 90);
        semdetail.put("chemistry", 80);
        semdetail.put("TOC", 50);
        semdetail.put("DSA", 70);
        System.out.println(semdetail.get("core java"));

        /*
        semdetail.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+'\t'+value);
            }
        });
         */
        semdetail.forEach((k,v) -> System.out.println(k+"    "+v));

//follows fifo
        //order for key not preserved
        PriorityQueue<String> movie = new PriorityQueue<>();
        movie.add(new String("titanic"));
        movie.add(new String("love actually"));
        movie.add(new String("christmas switch"));
        movie.add(new String("castle for christmas" ));


        System.out.println(movie.peek());
        System.out.println(movie.poll());
        movie.forEach(s-> System.out.println(s));


        System.out.println("Property uses");

        //non-generic version of hashmap ie, type safety not guaranteed
        Properties semdetail2 = new Properties();
        semdetail.put("core java", 60);
        semdetail.put("chemistry", 50);
        semdetail.put("TOC", 59);
        semdetail.put("DSA", 80);
        System.out.println(semdetail2);
    }
}
