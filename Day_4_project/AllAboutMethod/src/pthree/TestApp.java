package pthree;
//static

class TennisClub{
    static int countMember = 0;
    static void TrackMemCount(){
        countMember++;
        System.out.println("Total members joined "+countMember);
    }


    void DisplayBranches(String[] b){
        for (int index=0; index<3; index++)
        {
            b[index]="hello";
            System.out.println(b[index]+" ");
        }
//        for (String tempvar : b){
//
//            System.out.println(tempvar+" ");}
    }
}

public class TestApp {
    static{
        System.out.println("Pre processing");
    }


    public static void main(String[] args) {
        TennisClub memone = new TennisClub();
        memone.TrackMemCount();
        //memone.branches1 ="noida";

        TennisClub memtwo = new TennisClub();
        memtwo.TrackMemCount();
        //memtwo
        TennisClub memthree = new TennisClub();
        memthree.TrackMemCount();

        String branch[] = new String[3];
        branch[0] = "Noida";
        branch[1] = "Kolkata";
        branch[2] = "Bengaluru";


        memthree.DisplayBranches(branch);
        for (int index=0; index<3; index++)
        {
            System.out.println(branch[index]+" ");
        }


    }
}
