package pseven;
//functional interface

// it holds one and only abstract methods but can have multipe  default and static method
// from java 8 onwards

import java.util.Calendar;

// FUNCTIONAL INTERFACE CAN ONLY HAVE ONE ABSTRACT CLASS
@FunctionalInterface
interface  MyFunctionalInterface{

    void method1();
    //void method2();

    default void method3(){
        System.out.println("m3 of myfunctional interface");
    }
    default void method4(){
        System.out.println("m4 of myfunctional interface");
    }
    static void method5(){
        System.out.println("m5 of myfunctional interface");
    }
    static void method6(){
        System.out.println("m6 of myfunctional interface");
    }
}
//annotations are meta data ie, data abt data

class Child implements MyFunctionalInterface{

    @Override
    public void method1() {
        System.out.println("m1 got defined in child after the implementation");
    }
    public void method3(){
        System.out.println("m3 the default method of parent implemented in child");
        MyFunctionalInterface.super.method3();
    }

}

//functional interface collection of only one abstract class
@FunctionalInterface
interface Calculator{
    int Sum(int a, int b);
}


public class TestApp {
    public static void main(String[] args) {
        //Child child = new Child();
        MyFunctionalInterface child = new Child(); //dynamic method dispatch
        child.method1();
        child.method3();
        child.method4();

        MyFunctionalInterface.method5();
        MyFunctionalInterface.method6();

        System.out.println("Anonymous class Syntax");
        MyFunctionalInterface cone = new MyFunctionalInterface() {
            @Override
            public void method1() {
                System.out.println("abstract m1 of functional interface defined using anonymous class");
            }
        };
        cone.method1();

        System.out.println("using anonymous method syntax or lambda expression");

        MyFunctionalInterface ctwo = () -> System.out.println("abstract m1 of functional interface defined using lambda exp");

        ctwo.method1();

        System.out.println("use of lambda exp on a calculator functional interface");

        Calculator calculator = new Calculator() {
            @Override
            public int Sum(int a, int b) {
                return a+b;
            }
        };

        int res;
        res = calculator.Sum(3,4);
        System.out.println("summation using the syntax of Anonymous class "+res);

        Calculator caltwo= (a,b)-> a+b;
        res = calculator.Sum(5,6);
        System.out.println("Summation using lambda exp "+res);

        res = calculator.Sum(45,96);
        System.out.println("Summation using lambda exp "+res);
    }
}
//lambda can be used for only abstract class (not for default class) and functional interfaces (not for traditional interfaces)
// default access specifier in class and package are different
//runnable --> run()
// s
