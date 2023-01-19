package String_Class;

public class string_method {//
	public static void main(String[] args) {
		String s1= "INDIA";
		String s2 ="india";
		String s3 ="dia"  ;
		
		System.out.println(s1 .length());
		// length method
		System.out.println(s1.toUpperCase());
		//Touppercase method
		System.out.println(s1.toLowerCase());
		// tolowercasemethod
		System.out.println(s1.equals(s2));
		//equal()
		System.out.println(s1.equalsIgnoreCase(s2));
		//equalignorecase
		System.out.println(s1.contains(s3));
		//
		System.out.println(s2 .contains(s3));
		// contains method
		System.out.println(s1.charAt(4));
		System.out.println(s2.charAt(3));
		//charAt method
		System.out.println(s1.indexOf("N"));
		//indexof method
		System.out.println(s1.concat(s3));
		//concat method
		System.out.println(s1.substring(2));
		//sbstring method
		System.out.println(s1.startsWith("IN"));
		//startswith method
		System.out.println(s1.endsWith("IA"));
	}

}
