package testyntra_string_pro;

public class Rev_fsthalf_secndhalf_saperatly {
	public static String reverse(String str)
	{
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
					
		}
		return rev;
	}
public static void main(String[]args)
{
	String str="sahanu";
	if(str.length()%2==0)
	{
		String rev=reverse(str.substring(0,str.length()/2))+reverse(str.substring(str.length()/2,str.length()));
		System.out.println(rev);
	}
	else
	{
		System.out.println("not reverse");
	}
}}
