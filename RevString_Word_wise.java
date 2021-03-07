package testyntra_string_pro;

public class RevString_Word_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hi hello how are you";
String []ch=str.split(" ");

for(int i=0;i<=ch.length-1;i++)
{
	char[]ch1=ch[i].toCharArray();
	for(int j=ch1.length-1;j>=0;j--)
	{
		System.out.print(ch1[j]);
	}
	System.out.print(" ");
}
	}

}
