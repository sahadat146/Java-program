package testyntra_string_pro;
       
import java.util.Scanner;
        
public class Rev_aString {
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		char[]ch=str.toCharArray();
	    System.out.println("Given string is "+str);
	    System.out.println("Reverse string is =");
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    	System.out.print(ch[i]);
	    }
	    System.out.println();
	    for(int i=str.length()-1;i>=0;i--)
	    {
	    	System.out.print(str.charAt(i));
	    }
	    
	    
	   
}}