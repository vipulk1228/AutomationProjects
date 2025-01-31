package sampleJavaPackage;

public class Conditional {

	public static void main(String[] args) {

      //  if statement
		int age=17;
		
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		
		// if else statement
		
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not Eligible for voting");
		}
		
		// even odd number
		
		int num=15;
		
		if (num%2==0) 
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
			
		}
		
		// positive & negative number
		
		int num1=30;
		
		if (num1>0)
		{
			System.out.println("positive no");
		}
		else if(num1<0)
		{
			System.out.println("Negative no");
		}
		else
		{
			System.out.println("Zero");
		}
		
		// largest of 3 numbers
		
		int a=10,b=20,c=30;
		
		if (a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}
		
		// 
		/*if(true)
		{
			System.out.println("print1");
		}
		else
		{
			System.out.println("print2");
		}
		*/
		
		//weekday program
		
		int weekno=20;
		
		if(weekno==1)
		{
			System.out.println("Sunday");
		}
		else if(weekno==2)
		{
			System.out.println("Monday");
		}
		else if(weekno==3)
		{
			System.out.println("Tuesday");
		}
		else if(weekno==4)
		{
			System.out.println("Wednesday");
		}
		else if(weekno==5)
		{
			System.out.println("Thrusday");
		}
		else if(weekno==6)
		{
			System.out.println("Friday");
		}
		else if(weekno==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Wrrong number");
		}

	}

}
