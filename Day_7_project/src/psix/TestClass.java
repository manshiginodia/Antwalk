package psix;

import java.util.Optional;

//Optional class
// was introduced in java 8 to address the problem o NullPointerException
public class TestClass {
    public static void main(String[] args) {
        String username =null;
      /*  if (username== null){ //== compares the value whereas equals() compare the hash code
            System.out.println("Null is there as an obj reference ");
        }
        else{
            System.out.println(username);
        }*/

        //nullpointer means stack allocation is done but heap allocation not done

//        if (username.equals(null)){ //== compares the value ie content whereas equals() compares the hash code
//            System.out.println("Null is there as an obj reference ");
//        }
//        else{
//            System.out.println(username);
//        }

        Optional<String> optional=Optional.ofNullable(username);
        System.out.println(optional.isEmpty()); // checks if the value is null
        System.out.println(optional.get()); //returns the value from the object it gets the value from the reference so, when there is no obj reference in null it gives an error
        System.out.println(optional.orElse("no obj reference")); //prints the value in the variable and if the value is null it prints the statement
    }
}


/*
optional is like a box, it stores two states ie, whether object has been created
or not

optional class is a generic class
 */