// constructor vs Function

class Employee{
	
	
	
	String ename;
	int eid;
	double esalary;
	
	//Default constructor
	Employee(){
		ename =null;
		eid =0;
		esalary =0.0;
		
	}
	
	//parameterized constructor
	Employee(String en, int id, double es){
		ename =en;
		eid =id;
		esalary=es;
	}
		
	void Show(){
		System.out.println(ename+" "+eid+" "+esalary);
	}
}

class TestConstructor{
	public static void main(String[] args){
	
		Employee eobj1= new Employee("man",10,111.0);
		//eobj.ename= "manshi";
		//eobj.eid= 10;
		//eobj.esalary =10000;
		eobj1.Show();
		Employee eobj2= new Employee();
		eobj2.Show();
	}


}

