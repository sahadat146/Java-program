package testyntra_string_pro;

public class RevWithoutRevWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="i love you";
String[]ch=str.split(" ");
String str1=" ";
for(int i=ch.length-1;i>=0;i--)
{
	str1=str1+" "+ch[i];
}
System.out.println(str1);
	}

}
