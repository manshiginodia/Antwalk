package pthree;

// inheritance of abstract class

abstract class Animal{
    protected String name;
    String foodhabbit;
    int nooflimbs;

    abstract void ShowGenInfo();
}

class Avian extends Animal {
    String canfly;
    void ShowFlyStatus(){
        System.out.println("in Avian the fly status is "+canfly);
    }
    void ShowGenInfo(){
        System.out.println("From avian "+name+" "+foodhabbit+" "+nooflimbs);
    }
}

class Reptile extends Animal {
    String canswim;
    void ShowSwimStatus(){
        System.out.println("in reptile the swim status is "+canswim);
    }
    void ShowGenInfo(){
        System.out.println("From reptile "+name+" "+foodhabbit+" "+nooflimbs);
    }

}

public class TestApp {
    public static void main(String[] args) {

//  object of the abstract class cannot be created
//        Animal aniobj = new Animal();
//        aniobj.name = null;
//        aniobj.foodhabbit = null;
//        aniobj.nooflimbs = 0;
//        aniobj.ShowGenInfo();

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