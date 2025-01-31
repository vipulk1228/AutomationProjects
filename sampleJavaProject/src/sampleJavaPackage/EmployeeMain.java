package sampleJavaPackage;

public class EmployeeMain {



public static void main(String[] args) {

	Employee e=new Employee();
	e.eid=101;
	e.eName="vipul";
	e.sal=456800;
	
	e.display();
	
	Employee e1=new Employee();
	e1.eid=201;
	e1.eName="khutale";
	e1.sal=70000;
	e1.display();
	
	
	e.m1();
	System.out.println(e.m2("vip"));
  }
}