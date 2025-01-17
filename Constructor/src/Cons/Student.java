package Cons;

public class Student {
	
	int stdid;
	String stdname;
	
	Student(int a,String b)
	{
		stdid = a;
		stdname = b;
	}

	public static void main(String[] args) {
		
		Student s = new Student(01,"Dinga");
		Student s1 = new Student(02,"Dingi");
		
		System.out.println("Student ID is:"+s.stdid+" Student name is:"+s.stdname);
		System.out.println("Student ID is:"+s1.stdid+" Student name is:"+s1.stdname);

	}

}
