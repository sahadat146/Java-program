package testyntra_string_pro;

import java.util.HashMap;
import java.util.Scanner;

public class First_Repeated_nonRepated_char {
	static void frrc(String inpString)
	{
		HashMap<Character,Integer>charCountmap=new HashMap<Character,Integer>();
		char[]ch=inpString.toCharArray();
		for(char c:ch)
		{
			if(charCountmap.containsKey(c))
				charCountmap.put(c,charCountmap.get(c)+1);
			else
			{
				
				charCountmap.put(c,1);
			}}
			for(char c:ch){

			if(charCountmap.get(c)==1)
			{
				System.out.println("First non-repating char"+inpString+"is<----"+c+"");
				break;
			}
			}
			for(char c:ch)
			{
			if(charCountmap.get(c)>1) {
				System.out.println("First_repating char"+inpString+"<----is--->"+c);
				break;
			}
			}
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String input=sc.next();
frrc(input);
	}

}


/*
else
{
	
	charCountmap.put(c,1);
}}
for(char c:ch){

if(charCountmap.get(c)==1)
{
	System.out.println("First non-repating char"+inpString+"is"+c+"");
	break;
}
}
for(char c:ch)
{
if(charCountmap.get(c)>1) {
	System.out.println("First_repating char"+inpString+"is"+c);
	break;
}
}
}
*/