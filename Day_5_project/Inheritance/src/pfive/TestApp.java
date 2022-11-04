package pfive;
abstract class Parent{
    abstract void ShowInfo();
}
class ChildOne extends Parent{
    @Override
    void ShowInfo() {
        System.out.println("child one got implemented");
    }
}
class ChildTwo extends Parent{

    @Override
    void ShowInfo() {
        System.out.println("child two got implemented");
    }
}
public class TestApp {
    public static void main(String[] args) {
//        ChildOne cone = new ChildOne();
//        cone.ShowInfo();
//        ChildTwo ctwo = new ChildTwo();
//        ctwo.ShowInfo();

        Parent pervar;
        pervar =new ChildOne(); //late binding
        pervar.ShowInfo(); //JVM will see ref of the object

        pervar =new ChildTwo(); //late binding
        pervar.ShowInfo(); //JVM will see ref of the object
    }
}
