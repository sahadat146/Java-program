package testyntra_string_pro;

public class Remove_all_WhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="       hi hello how     ";
		String str1=str.replaceAll("\\s","");
		System.out.println(str1);
	}} 
		
		
		
		/*
String str="hi hrlpo ifiref nfmie";
char []ch=str.toCharArray();
StringBuffer str2=new StringBuffer();
for(int i=0;i<ch.length;i++)
{
	if((ch[i]!=' ')&&(ch[i]!='\t'))
	{
		str2.append(ch[i]);
	}
}
String str3=str2.toString();
System.out.println(str3);
	}

}
*/