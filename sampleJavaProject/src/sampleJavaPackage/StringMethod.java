package sampleJavaPackage;

public class StringMethod {

	public static void main(String[] args) {


		String s= "Welcome";
		
		String t=new String("come");
		
		//  // length of string
		
		System.out.println(s.length());  // length of string
		
		System.out.println(t.length());  // length of string
		
		System.out.println("Java".length());
		
		// concat 
		
		System.out.println(s.concat(t));
		
		// trim remove spaces 
		
		String u="   javaautomation   ";
		
		System.out.println(u.trim());
		
		//charAt() return a character 
		
		System.out.println(s.charAt(2));
		
		// contains() return true / false value
		
		System.out.println(s.contains("WeL"));
		
		//equals() equalsIgnoreCase()
		
		String a="abc";
		String b="abc";
		String c ="ABC";
		
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));
		
		// replace() replace single multiple characters
		
		System.out.println(a.replace('a', 'v'));
		
		//substring()   start index-0   end index starts with 1= total characters 
		
		String ss="automation";
		System.out.println(ss.substring(2));
		System.out.println(ss.substring(2, 3));
		
		// toUppercase()   toLowerCase()
		
		System.out.println(a.toUpperCase());
		
		System.out.println(c.toLowerCase());
		
		//Split
		
		String mail="vipul@gmail.com";
		
		String d[]=mail.split("@");
		
		System.out.println(d[0]);
		
		System.out.println(d[1]);
		
		
	}

}
