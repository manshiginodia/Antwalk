package pseven;
//local inner class
class Car {
    String carbrandname;

    void SwitchOnEngine(){
        System.out.println(carbrandname + " car engine on");

        //Now we will place Ms and Ac as inner class but local to the function of outer class
        // local non static nested class or local inner class
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
        //object created locally
        MS msobj = new MS();
        msobj.msname = "Philips";
        msobj.SwitchOffMs();
        msobj.SwitchOnMs();

        AC acobj = new AC();
        acobj.acname = "Voltas";
        acobj.SwitchOffAC();
        acobj.SwitchOnAC();
    }
    void SwitchOffEngine(){
        System.out.println(carbrandname + " car engine off");
        
    }

}

public class TestApp {
    public static void main(String[] args) {
        Car carobj = new Car();
        carobj.carbrandname ="Tata Tiago";
        carobj.SwitchOnEngine();
        carobj.SwitchOffEngine();

    }

}