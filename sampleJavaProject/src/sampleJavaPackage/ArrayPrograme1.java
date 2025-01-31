package sampleJavaPackage;

public class ArrayPrograme1 {

	public static void main(String[] args) {

		// search element in array
		
		int a[]= {10,20,30,40,60,50};
		int search_ele=5;
		boolean b=false;
		
		//System.out.println(a.length);
		
		// Approach 1
		
		/*
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==search_ele)
			{
				System.out.println("Element found");
				b=true;
				break;
				
			}
		}
		if(b==false)
		{
			System.out.println("Element not found");
		}
		
		*/
		
		// Approach 2
		
		for(int x:a)
		{
			if(x==search_ele)
			{
				System.out.println("Element found");
				b=true;
				break;
			}
		}
		if(b==false)
		{
			System.out.println("Element not found");
		}
	}

}
