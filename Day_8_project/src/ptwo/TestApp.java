package ptwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{

    private String empname;
    private double empsalary;
    private int yoj;

    private List<String> projects;

    public Employee() {
        super();
    }

    public Employee(String empname, double empsalary, int yoj, List<String> projects) {
        this.empname = empname;
        this.empsalary = empsalary;
        this.yoj = yoj;
        this.projects = projects;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }

    public int getYoj() {
        return yoj;
    }

    public void setYoj(int yoj) {
        this.yoj = yoj;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empname='" + empname + '\'' +
                ", empsalary=" + empsalary +
                ", yoj=" + yoj +
                ", projects=" + projects +
                '}';
    }

}



public class TestApp {

    static List<String> projects;
    static List<Employee> emplist;

    static{
        List<String> proj1list  = new ArrayList<>();
        proj1list .add("Project 1- Payment Module");

        List<String> proj2list  = new ArrayList<>();
        proj2list .add("Project 2- a) Payment Module");
        proj2list .add("Project 2- b) Cart Module");

        List<String> proj3list = new ArrayList<>();
        proj3list.add("Project 3- a) Payment Module");
        proj3list.add("Project 3- b) Cart Module");
        proj3list.add("Project 3- c) Wishlist Module");

        Employee empone = new Employee("Manshi",6789,2017,proj1list);
        Employee emptwo = new Employee("Mack",80000,2014,proj2list);
        Employee empthree = new Employee("Jack",9999,2019,proj3list);

        emplist= new ArrayList<>();
        emplist.add(empone);
        emplist.add(emptwo);
        emplist.add(empthree);
    }

    //stream api -> map(), collect(), filter(), foreach(), flatmap()
    public static void main(String[] args) {
        /*
        System.out.println("retreiving all the details");
        for(Employee empobj : emplist){
            System.out.println(empobj);
        }
         */

        /*
        emplist.stream()
                .forEach(empobj -> System.out.println(empobj));
         */

        emplist.stream()
                .forEach( System.out::println);

        /*
        //providing 20% hike in salary for each employee

        emplist.stream()
                .map(empobj ->empobj.getEmpsalary()*1.20)
                .forEach(empobj -> System.out.println(empobj));
         */

        //providing 20% hike in salary for employee having salary greater than 7000

        emplist.stream()
                .filter(empobj -> empobj.getEmpsalary()>7000)
                .map(empobj ->empobj.getEmpsalary()*1.20)
                .forEach(empobj -> System.out.println(empobj));

        //Retrieve unified list of projects (that is a single list in String) assigned to each employee
        String unifiedprojectlist= emplist.stream()
                .map(empobj -> empobj.getProjects())
                .flatMap(string ->string.stream())
                .collect(Collectors.joining(","));
        System.out.println(unifiedprojectlist);


    }
}


 /*
        List<Integer> listnum = List.of(2,4,5,7,8,9);
        List<Integer> evennum = new ArrayList<>();

        //stream api

        System.out.println("Collecting even number from list using stream api");
        Stream<Integer> stream =listnum.stream();

        stream.filter(num->num%2==0)
                .collect(Collectors.toSet())
                .forEach(num-> System.out.println(num));

         */

        /*
        stream.filter(num->num%2==0)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

         */

        /*
        stream.filter(num->num%2==0)
                .collect(Collectors.toList())
                .forEach(num-> System.out.println(num));

         */

        /*
        stream.filter(num ->num%2==0)
                .forEach(num-> System.out.println(num+"\t"));

         */

        /*
        stream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                if(num%2 ==0){
                    evennum.add(num);
                }
            }
        });
        System.out.println("After stream api foreach "+ evennum);

         */



        /*
        //working with list without Stream api
        for (Integer num: listnum){
            if(num%2==0){
                evennum.add(num);
            }
        }
        System.out.println("Collecting even number from list without using stream api");
        System.out.println(evennum);

       */


        /*
        List<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(77);

        List<Integer> list3 = new ArrayList<>();

         */