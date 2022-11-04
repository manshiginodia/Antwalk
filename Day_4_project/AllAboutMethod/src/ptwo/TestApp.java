package ptwo;

class Admin {
    static int aid;
    static String aname;

    static void ShowDetails(){
        System.out.println(aid+" "+aname);
    }
}


public class TestApp {
    public static void main(String[] args){

        Admin.aid = 21;
        Admin.aname = "Manshi";
        Admin.ShowDetails();

    }
}
