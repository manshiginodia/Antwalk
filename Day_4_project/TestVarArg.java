//variable number argument passing

class Sample{
	//void printInfo(int a){
	//	System.out.println(a);
	//}
	//void printInfo(int a, int b){
	//System.out.println(a+" "+b);
	//}
	//void printInfo(int a, int b, int c){
	//	System.out.println(a+" "+b+" "+c);
	//}
	void printInfo(String xyz,int... a){
		System.out.print(xyz+" ");
		for (int temp: a){
			System.out.print(temp+" ");
		}
		System.out.println();
	}
	
}

class TestVarArg{
	public static void main(String[] args){
		Sample sobj = new Sample();
		sobj.printInfo("hello",22);
		sobj.printInfo("hello",21,3);
		sobj.printInfo("hello",2,8,5);
	}
}