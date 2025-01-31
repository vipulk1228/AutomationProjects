package sampleJavaPackage;

public class ArrayPrograme {

	public static void main(String[] args) {


		// Sum of array
	/*	
		int a[]= {1,2,3,4,5};
		
		int sum=0;
		
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println("Total sum is:"+sum);
	
	
	*/
		
		// even and odd number
		
		int a[]= {1,2,3,4,5,6,7};
		
		int even=0;
		int odd=0;
		
		for(int x:a)
		{
			if(x%2==0)
			{
				//even=even+1;  //1
				even++;
			}
			else
			{
				//odd=odd+1;  // 1+1
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
