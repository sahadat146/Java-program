package testyntra_string_pro;

public class ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="AFDGH";
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>='A' && ch[i]<='Z')
	{
		ch[i]=(char)(ch[i]+32);
	}
}
String str2=String.valueOf(ch);
System.out.println(str2);
}
}
