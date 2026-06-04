package com.strings;

public class Demo {

	public static void main(String[] args) {

			String s1 = "hello";
			
			String s2 = "hello";
			
			System.out.println(s1.equals(s2));
			System.out.println(s1 == s2);
			
			
			String s3 = new String("hello");
			
			String s4 = new String("hello");
			
			System.out.println(s3 == s4);
			
		
			s3 = s3.concat("world");
			
			System.out.println(s3);
			
			s3= s3 + "again";
			
			
			StringBuffer sb = new StringBuffer("hello");
			
			
				sb.append("world");
				
				System.out.println(sb);
				
				sb.reverse();
				
				
				System.out.println(sb);
			
			
			
			
			
			
			
			
			
		
	}

}
