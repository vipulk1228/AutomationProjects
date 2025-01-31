package sampleJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrograme3 {

	public static void main(String[] args) {


		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
	}

}
