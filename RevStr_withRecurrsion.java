package testyntra_string_pro;

public class RevStr_withRecurrsion {
	static void reverse(String str )
	
     	
	 {
	 
		if((str==null)||(str.length()<=1))
		System.out.print(str);
		else
		{
		
	
	System.out.print(str.charAt(str.length()-1)); //strt printing from last index
			 reverse(str.substring(0,str.length()-1));
	}
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String  str="java";
reverse(str);
	}

}

	
}