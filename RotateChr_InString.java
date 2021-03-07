package testyntra_string_pro;

public class RotateChr_InString {
	static String laftrotate(String str,int d)
	{
		String ans=str.substring(d)+str.substring(0,d);
		return ans;
	}
	static String Rightrotate(String str,int d)
	{
		return laftrotate(str,str.length()-d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="selenium hq";
System.out.println(laftrotate(str1,4));
String str2="selenium iq";
System.out.println(laftrotate(str2,2));
	}

}
