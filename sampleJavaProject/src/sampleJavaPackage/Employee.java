package sampleJavaPackage;

public class Employee {

	int eid;
	String eName;
	int sal;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(eName);
		System.out.println(sal);
	}
	
    void m1()
    {
    	System.out.println("Hello");
    }
    
    String m2(String name)
    {
    	return "How are you?"+name;
    }

}
