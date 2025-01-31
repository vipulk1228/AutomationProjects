package sampleJavaPackage;

public class ArrayPrograme2 {

	public static void main(String[] args) {


		int a[]= {100,200,300,400,300,300};
		
		int num=300;
		
		int count=0;
		
		for(int x:a)
		{
			if(x==num)
			{
				count++;
			}
		}
		System.out.println("Count of element is:"+count);
		
	}

}
