package testyntra_string_pro;

public class ReverseString_preserveThePositionOf_String {

	
		// TODO Auto-generated method stub
public static void reverse(String str)
{
	char[]ch=str.toCharArray();
	char[]ch1=new char[ch.length];
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==' ')
		{
			ch1[i]=' ';
		}
	}
	int j=ch1.length-1;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!=' ')
		{
			if(ch1[j]==' ')
			{
				j--;
			}
			ch1[j]=ch[i];
		j--;
		}
	}
	System.out.println(String.valueOf(ch1));
	
}

public static void main(String[] args) {
	reverse(" selenium is");
}
}
