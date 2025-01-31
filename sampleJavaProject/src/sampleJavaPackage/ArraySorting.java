package sampleJavaPackage;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {


		int a[]= {100,200,400,300,600,300};
		
		System.out.println("Belore Sorting....");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);    //  sorting array
		
		System.out.println("After Sorting....");
		System.out.println(Arrays.toString(a));
		
		
		char c[]= {'A','V','B','L','C'};
		
		Arrays.sort(c); // sorting array
		
		System.out.println(Arrays.toString(c));
		
		String s[]= {"VIPUL","VISHU","SHUBH"};
		
		Arrays.sort(s);  // sorting array
		
		System.out.println(Arrays.toString(s));
		
	}
	

}
