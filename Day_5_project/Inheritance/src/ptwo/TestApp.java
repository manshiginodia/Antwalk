package ptwo;

//inheritance of concrete class
class Animal{
    protected String name;
    String foodhabbit;
    int nooflimbs;

    void ShowGenInfo(){
        System.out.println("From animal "+name+" "+foodhabbit+" "+nooflimbs);
    }
}

class Avian extends Animal{
    String canfly;
    void ShowFlyStatus(){
        System.out.println("in Avian the fly status is "+canfly);
    }

}

class Reptile extends Animal{
    String canswim;
    void ShowSwimStatus(){
        System.out.println("in reptile the swim status is "+canswim);
    }
}

public class TestApp {
    public static void main(String[] args) {
        Avian avobj  = new Avian();
        Reptile repobj = new Reptile();

        avobj.name ="Parrot";
        avobj.foodhabbit = "Herbivorous";
        avobj.nooflimbs = 2;
        avobj.canfly ="yes";
        avobj.ShowGenInfo();
        avobj.ShowFlyStatus();

        repobj.name="lizard";
        repobj.foodhabbit="omnivorous";
        repobj.nooflimbs=4;
        repobj.canswim="yes";
        repobj.ShowGenInfo();
        repobj.ShowSwimStatus();
    }
}
