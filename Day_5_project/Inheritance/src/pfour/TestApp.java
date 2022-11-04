package pfour;
//multiple inheritance using interface
interface MS{
//variables by default final in interface and should be initialized
    String msname ="Harman";

    //methods should have no body
    void SwitchOnMs();
    void SwitchOffMs();
}

interface  AC{
    String acname = "Hitachi";
    void SwitchOnAC();
    void SwitchOffAC();
}

class Car implements MS, AC{
    String carbrandname;
    public void SwitchOnAC(){
        //acname = "Voltas" --> line shows error as value of acname cannot be changed
        System.out.println(acname +" Ac on in "+carbrandname);
    }
    public void SwitchOffAC(){
        System.out.println(acname +" Ac off in "+carbrandname);
    }
    public void SwitchOnMs(){
        System.out.println(msname +" Ms on in "+carbrandname);
    }
    public void SwitchOffMs(){
        System.out.println(msname +" Ms off in "+carbrandname );
    }
    void SwitchOnEngine(){
        System.out.println(carbrandname + " car engine on");
    }
    void SwitchOffEngine(){
        System.out.println(carbrandname + " car engine off");
    }
}
public class TestApp {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.carbrandname ="tata tiago";
        obj.SwitchOnEngine();
        obj.SwitchOffEngine();
        obj.SwitchOffAC();
        obj.SwitchOnAC();
        obj.SwitchOffMs();
        obj.SwitchOnMs();

    }

}
