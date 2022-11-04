package psix;

//inner class --> aggregation

class Car {
    String carbrandname;

    void SwitchOnEngine() {
        System.out.println(carbrandname + " car engine on");
    }
    void SwitchOffEngine(){
        System.out.println(carbrandname + " car engine off");

    }
    // outter class Car methods end here
    //member non static nested class or member inner class
    class MS{
        public String msname;
        void SwitchOnMs(){
            System.out.println(msname +" Ms on "+ carbrandname);
        }
        void SwitchOffMs(){
            System.out.println(msname +" Ms off ");
        }
    }
    class  AC{
        String acname;
        void SwitchOnAC(){
            System.out.println(acname +" Ac on ");
        }
        void SwitchOffAC()
        {
            System.out.println(acname +" Ac off ");
        }
    }

}

public class TestApp {
    public static void main(String[] args) {
        Car carobj = new Car();
        carobj.carbrandname ="Tata Tiago";
        carobj.SwitchOnEngine();
        carobj.SwitchOffEngine();

        // object creation of inner class
        Car.MS msobj = carobj.new MS();
        msobj.msname = "Philips";
        msobj.SwitchOffMs();
        msobj.SwitchOnMs();

        Car.AC acobj = carobj.new AC();
        acobj.acname = "Voltas";
        acobj.SwitchOffAC();
        acobj.SwitchOnAC();



    }

}