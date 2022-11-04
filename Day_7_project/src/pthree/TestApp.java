package pthree;

//generic function

class Sample<T>{ //placeholder
//    char ShowInfo(char info){
//        return info;
//    }
//    String ShowInfo(String info){
//        return info;
//    }

    //placeholder are replaced with corresponding wrapper classes by the JVM at the time of unction call ie run time this is called type erasing
    //function which data type neutral -> generic in nature -> type safe code
    T ShowInfo(T info){
        return info;
    }
}
public class TestApp {
    public static void main(String[] args) {
        Sample sone = new Sample();
        System.out.println(sone.ShowInfo('A'));
        System.out.println(sone.ShowInfo("Manshi"));
    }
}
