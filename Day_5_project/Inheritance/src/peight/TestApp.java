package peight;

//anonymous class

abstract class Sample{
    abstract void SampleInfo();
}


public class TestApp {
    public static void main(String[] args) {
        Sample s = new Sample(){
            void SampleInfo(){
                System.out.println("hello");
            }
        };
        s.SampleInfo();
    }
}
