import java.util.*;
class StringMani
{
	public static void main(String args[])
	{
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String Str1=sc.nextLine();
		System.out.println("Length of the string:"+Str1.length());
		System.out.println("String endswith 'g':"+Str1.endswith("g"));
		System.out.println("String contains 'oo':"+Str1.contains("oo"));
		System.out.println("String in lowercase:"+Str1.toLowerCase());
		System.out.println("String in uppercase:"+Str1.toUpperCase());
		System.out.println("String replaced:"+Str1.replaceAll("oo","li"));
	}
}
