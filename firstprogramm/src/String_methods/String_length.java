package String_methods;

public class String_length {
	public static void main(String[] args)
	{
		String s = "sai ram";
		String s1 = "prince";
		
		System.out.println(s.length());//length method
		
		
		System.out.println(s.concat(s1));//concat method 
		
		s = "   sai ram   ";//trim method
		System.out.println("before triming: "+s);
		System.out.println("after triming: "+s.trim());
		
		String s3 = "mahesh babu";
		System.out.println(s3.charAt(3));//cgarAt() given index number
		
		String s4 = "pendem";
		System.out.println(s4.contains("pen"));//contains() 
		
		String s11 = "sai ram";
		String s12 = "sai ram";
		System.out.println(s11.equals(s12));//s.equals() whether the given two strings are sam or not
		
		String s123 = "sai";
		String s234 = "ram";
		System.out.println(s123.equals(s234));
		
		String s9 = "welcome";
		System.out.println(s9.replace('w', 'h'));//replacing the characters or letters
		
		String s5 = "sai ram pendem";
		System.out.println(s5.replace("pendem", "prince"));  //replacing the words
		
		String s0 = "srisai";//extracting substring from the man string
		System.out.println(s0.substring(1,4));
		
		String s6 = "SAI RAM";
		System.out.println(s6.toLowerCase());//returns the string in lowerCase letters
		
		String s7 = "prince";
		System.out.println(s7.toUpperCase());//returns the string in upperCase letters
		
		
		
			
	}

}
