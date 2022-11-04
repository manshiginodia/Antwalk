package pnine;
// static inner class

class Outer{
    static class Inner{
        static void DisplayInfo(){
            System.out.println("Static inner method of static inner class");
        }
    }
}
public class TestApp {
    public static void main(String[] args) {
        Outer.Inner.DisplayInfo();
    }
}

