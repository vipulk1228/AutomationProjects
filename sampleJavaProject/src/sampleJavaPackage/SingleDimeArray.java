package sampleJavaPackage;

public class SingleDimeArray {

	public static void main(String[] args) {

		// Approach 1
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// Approach 2
		
		int b[]= {100,200,300,400,500};
		
		// length of array
		
		System.out.println(a.length);
		
		// Read value
		
		System.out.println(a[1]);
		
		System.out.println(b[3]);
		
		
	}

}
