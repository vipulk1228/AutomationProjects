package sampleJavaPackage;

public class Whileloop {

	public static void main(String[] args) {
		int i=1;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		
		int j=5;
		
		while(j>=0)
		{
			System.out.println(j);
			j--;
		}
		
		//even no 1 to 10
		
		int c=2;
		while(c<=10)
		{
			System.out.println(c);
			c=c+2;
		}
		
		//odd no 1 to 10
		
				int d=1;
				while(d<=10)
				{
					System.out.println(d);
					d=d+2;
				}
				
		// even no 1 to 10
		int e=1;
		while(e<=10)
		{
			if(e%2==0)
			{
				System.out.println("even no is"+" "+e);
			}
			else
			{
				System.out.println("odd no is"+" "+e);
			}
			e++;
		}

	}

}
