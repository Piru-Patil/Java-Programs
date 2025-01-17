package Thiskey;

public class Test {
	
	int empid;
	String empName;
	double empSal;
	
	Test(int empid, String empName, double empSal)
	{
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
	}

	public static void main(String[] args) {
		
		Test t = new Test(212,"Dinga",27348.43);
		Test t1 = new Test(323,"Dingi",27648.21);
		
		System.out.println(t.empid+" "+t.empName+" "+t.empSal);
		System.out.println(t1.empid+" "+t1.empName+" "+t1.empSal);

	}

}
