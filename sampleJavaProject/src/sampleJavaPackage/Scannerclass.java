package sampleJavaPackage;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {


		System.out.println("Enter first no");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.println("Enter Second no");
		
		int b=sc.nextInt();
		
		System.out.println("Addition of num is:"+(a+b));
		
		
		//
		
		//String value
		
		String s=sc.next();
		
		System.out.println("city name is:"+s);
	}

}
