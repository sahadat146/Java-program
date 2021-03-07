package testyntra_string_pro;

public class ReverseEachandEveryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="i love ioo";
String ch[]=str.split(" ");
String str1=" ";
for(String a:ch)
{
	 String str3=" ";
	 for(int i=a.length()-1;i>=0;i--)
	 {
		 str3=str3+a.charAt(i);
	 }
	 str1=str3+" "+str1;
	 
}
System.out.println(str1);
	}

}
