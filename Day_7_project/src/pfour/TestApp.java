package pfour;

// generic class
//we can restrict the placeholder like
//class Sample<U extends Integer, V>{}
//in the above the u has been restricted to only take integer values

class Sample<U,V>{
    U a;
    V b;
    U setInfo(U infoone, V infotwo){
        a= infoone;
        b= infotwo;
        System.out.println(b);
        return a;
    }

}

public class TestApp {
    public static void main(String[] args) {

        //explicit
        Sample<String,Integer> objone = new Sample();
        System.out.println(objone.setInfo(new String("Rohan"),new Integer (22)));

        //implicit
        Sample objtwo = new Sample();
        System.out.println(objtwo.setInfo(22.55,'M'));
    }
}
