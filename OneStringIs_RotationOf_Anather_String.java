package testyntra_string_pro;

public class OneStringIs_RotationOf_Anather_String {

	
		// TODO Auto-generated method stub
public static boolean checkrotate(String str1,String str2)
{
	if(str1.length()!=str2.length())
	{
		return false;
	}
	String str3=str1+str1;
	if(str3.contains(str2))
		return true;
	else
		return false;
}
public static void main(String[] args) {
	String str1="javfgua";
	String str2="ajava";
	System.out.println(" check");
	if(checkrotate(str1,str2))
	{
		System.out.println(str2+"rotate of "+str1);
		
	}
	else
	{
		System.out.println(str2+"not rotate of "+str1);
	}
	}

}
