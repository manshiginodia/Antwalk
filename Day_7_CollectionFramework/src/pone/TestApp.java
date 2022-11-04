package pone;
//collection framework intro
// list implementation


import java.util.*;
import java.util.function.Consumer;

public class TestApp {
    public static void main(String[] args) {
        /*
we can have duplicate
as indexed
order is maintained
not thread safe
 */
        ArrayList<String> empnamecol = new ArrayList();
        empnamecol.add(new String("Manshi"));
        empnamecol.add("Mack");
        empnamecol.add("Mini");
        empnamecol.add("Mack");
        empnamecol.add("Jack");
        System.out.println(empnamecol.get(2));
        System.out.println(empnamecol);
        //iterator is not static it is a reference
         //forward only traversal
        Iterator<String> iteratorr = empnamecol.iterator();
            while(iteratorr.hasNext()){
                System.out.println(iteratorr.next());
          }

        //reverse traversal can be done using ListIterator
        ListIterator<String> iterator = empnamecol.listIterator(empnamecol.size());
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }



        LinkedList<String> empcitycol = new LinkedList();
        empcitycol.add(new String("Manshi"));
        empcitycol.add("Mack");
        empcitycol.add("Mini");
        empcitycol.add("Mack");
        empcitycol.add("Jack");
        for(String tempcol: empcitycol){
            System.out.println(tempcol+" belongs to nri");
        }
        System.out.println(empcitycol.get(2));
        System.out.println(empcitycol);

//thread safe
        Vector<String> favsportcol = new Vector<>(2,3);
/* initially there are 2 memory spaces and whenever it has been occupied 3
new spaces are added irrespective of the number of the elements because of
 the parameter provided
 */
        System.out.println("at beginning the size of vector collection is "+favsportcol.size());
        System.out.println("initial capacity is "+favsportcol.capacity());

        favsportcol.add(new String("Cricket"));
        favsportcol.add(new String("Hockey"));
        favsportcol.add(new String("Badminton"));
        favsportcol.add(new String("Chess"));
        favsportcol.add(new String("Cricket"));
        favsportcol.add(new String("Chess"));

        System.out.println("after adding the size of vector collection is "+favsportcol.size());
        System.out.println("after adding is "+favsportcol.capacity());

        Enumeration<String> enumeration = favsportcol.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


        System.out.println("Accessing ArrayList using foreach() for java 8");
        /*
        empnamecol.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */

        empcitycol.forEach((s)-> System.out.println(s));
        // empnamecol.forEach(System.out::println);
    }
}
