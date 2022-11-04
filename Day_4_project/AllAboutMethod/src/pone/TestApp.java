package pone;
// All about methods and constructors
// Pizza delivery system

// There can only be one public class in a file, if we want customer class to be public we need a different file named Customer.java
class Customer{
    int custid;
    String custname;
    String custaddr;

    //public not needed here as the classes of pone package can access the methods
    void ShowCustomerInfo(){
        System.out.println(custid+" "+custname+" "+custaddr);
    }

}

class Order{
    int orderid;
    String ordername;
    double orderprice;
    Customer custobj;

    void ShowOrderDetail(){
        System.out.println(orderid+" "+ordername+" "+orderprice);
    }

    /*
        syntax of methods:
        step1: function declaration
            access_specifier return_type functionName(parameter or variable local to function){
                step2: function definition or function implementation
                    business logic or algorithms
            }
        step3: function calling
            object_name.function_name(3000) -> actual argument
     */

    // we can pass primitive data types ie, int, float, double, char or String as parameter
    //callee function
    double OrderDiscount(double discount){
        if (orderprice>=800) {
            orderprice = orderprice - discount;
            // System.out.println("Final order price for the object "+ordername+" after discount of "+discount +" = "+orderprice);
        }
        return orderprice;
    }

    //passing object of another class as parameter
    void PlaceOrder(Customer custobj){
        this.custobj =custobj; //this is a pointer to the current class
        System.out.println(custobj.custname+" placed an order of "+ ordername);
    }

}



public class TestApp {

    //caller function
    public static void main(String[] args){
        System.out.println("Hi! Welcome to NRI FinTech Pizza Canteen Version 1.0");

        // creating customers by creating objects of customer class
        //ClassName objectname = new ClassName();
        Customer custone = new Customer();
        // making object a fully qualified one ie, initializing all attributes of the obj
        custone.custid = 11;
        custone.custname = "Manshi";
        custone.custaddr = "Kolkata";

        //customer class is also known as customer- the user defined data type
        Customer custtwo = new Customer();
        custtwo.custid = 12;
        custtwo.custname = "Mack";
        custtwo.custaddr = "Noida";

        custone.ShowCustomerInfo();
        custtwo.ShowCustomerInfo();

        // creating orders
        Order orderone = new Order();
        orderone.orderid = 21;
        orderone.ordername = "Farmfresh Pizza";
        orderone.orderprice = 900;


        double orderdiscount =200;
        double fprice = orderone.OrderDiscount(orderdiscount);
        System.out.println("Final order price for the object "+orderone.ordername+" after discount of "+orderdiscount +" = "+fprice);

        // we need to assign order id 21 to customer 12
        orderone.PlaceOrder(custtwo); // passing an object as a parameter

        Order ordertwo = new Order();
        ordertwo.orderid = 22;
        ordertwo.ordername = "Veg Pasta";
        ordertwo.orderprice = 399.50;

        orderone.ShowOrderDetail();
        ordertwo.ShowOrderDetail();

    }
}
