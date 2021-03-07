package testyntra_string_pro;

public class Duplicate_charIn_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="seleuniuum";
char[]ch=str.toCharArray();
for(int i=0;i<ch.length-1;i++)
{
	int count=1;
	for(int j=i+1;j<ch.length-1;j++)
	{
		if(ch[i]==ch[j])
		{
			count++;
			ch[j]='0';
		}
	}
	if(count>1&&ch[i]!='0')
	{
		System.out.println(ch[i]+":...has occured"+count+"times");
	}
}
	}

}
