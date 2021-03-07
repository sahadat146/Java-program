package testyntra_string_pro;

public class NumberToSpecelChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String  str="bangalore" ;   //,res=" ";

String res="";

for(int i=0;i<str.length();i++)
{
	if(i%1==0)
	{
		res+="#";
	if(i%3==0)
	{
		res+="&";
	}
	}
	else
		res+=str.substring(i,i+1);
}
System.out.print(res);
	}

}
