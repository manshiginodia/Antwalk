package ptwo;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestApp {

    public static void main(String[] args) {

        // non indexed so order not preserved
        // duplicates not allowed
        //not sorted by default
        Set<String> empcitycol = new HashSet();
        empcitycol.add(new String("Manshi"));
        empcitycol.add("Mack");
        empcitycol.add("Mini");
        empcitycol.add("Mack");
        empcitycol.add("Jack");

        System.out.println( empcitycol);

        //Tree set
        //output sorted by default
        //ascending by default
        TreeSet<String> sortedcol= new TreeSet<>();
        sortedcol.addAll(empcitycol);
        System.out.println(sortedcol);

        //to sort in descending order on any other except ascending
        //Comparable->this.compareTo(obj2) and comparator  -> compare(obj1, obj2)

        sortedcol.forEach(info-> System.out.println(info));


       sortedcol.forEach(info-> System.out.println(info));
    }
}
