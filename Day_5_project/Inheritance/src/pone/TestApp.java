package pone;

//this vs super keyword
//constructor chaining
class Parent{
    Parent(){
        System.out.println("Parent class- Zero parametrized constructor");
    }
    Parent(int a){
        System.out.println("Parent class- Single parametrized constructor");
    }
    void Show(){
        System.out.println("just a method in parent class");
    }
}
class Sample extends Parent{

    Sample(){
        System.out.println("Sample class- Zero parametrized constructor");
    }
    Sample(int a){
        System.out.println("Sample class- Single parametrized constructor");
    }
    Sample(int a, int b){
        //this(22);
        super(29);
        System.out.println("Sample class- Double parametrized constructor");
    }
}

public class TestApp {

    public static void main(String[] args) {

        Sample samobj = new Sample(2,3); //compiler resolves and decides which function to call
    }
}
