package pfive;
//mutability vs immutability

import java.sql.SQLOutput;

public class TestApp {

    public static void main(String[] args) {
        String nameone ="Manshi"; //String nameone = new String("Manshi");
        //nameone object of a class String
        String nametwo =new String("Manshi");

        System.out.println(nameone.hashCode());
        System.out.println(nametwo.hashCode());
        System.out.println(nameone.equals(nametwo));//compares the hashcode

        StringBuilder name1 = new StringBuilder("Manshi");

        StringBuilder name2 =new StringBuilder("Manshi");

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1.equals(name2));//compares the hashcode

    }
}
//hashcode method returns heap reference that was allocated using the new key word
// when the information stored in 2 stacks are same the Jvm automatically refers them to the same heap memory
//so on comparison the hash code shows they are equal
// references are not changed for duplicate values so changes made in one reflects in the other thus making strings immutable
//the mutable version of string is called stringbuilder

/*
useful classes:

object
  _toSr

 */