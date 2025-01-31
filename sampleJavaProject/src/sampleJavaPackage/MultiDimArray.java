package sampleJavaPackage;

public class MultiDimArray {

	public static void main(String[] args) {

		// 1
		
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		// 2
		
		int b[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("length of rows is "+a.length);
		
		System.out.println("length of column is "+a[0].length);
		
		// for loop
		
		for (int r=0; r<=2; r++)
		{
			for (int c=0; c<=1; c++)
			{
				System.out.println(a[r][c]);
			}
		}
		
		// for each loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}

}
