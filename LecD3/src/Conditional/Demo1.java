package Conditional;


public class Demo1
{
	public static void main(String args[])
	{
		String s1="Ramesh";
		String s2="Ramesh";
		String s3= new String("Ramesh");
		String s4= new String("Ramesh");
		
		System.out.println(s1 == s2); // true //check string val is same or not
		System.out.println(s1 == s3); // false
		System.out.println(s3 == s4); // false
		//System.out.println(s1.equals(s2)); // true //check address is same or not
		System.out.println(s3.equals(s4)); // false
		String s5= new String("ramesh");
		System.out.println(s5.equals(s4)); // false
		System.out.println(s5.equalsIgnoreCase(s4)); // false
		s1.concat("Roy"); //string s are immutable we cant modify. we should stored in diff str
		System.out.println(s1);
		
		StringBuffer sb= new StringBuffer("Raj");
		sb.append("kumar");
		System.out.println(sb);
	
	}

}