package testyntra_string_pro;

import java.util.LinkedHashMap;

public class LongestSubstring_WithoutRepeationg_Cheracter {
static void lonsubstring(String inputString)
{
	char[]ch=inputString.toCharArray();
	String lonsubstring=null;
	int lonsunstringlength=0;
	LinkedHashMap<Character, Integer>chmap=new LinkedHashMap<Character,Integer>();
	for(int i=0;i<ch.length;i++)
	{
		
		char ch1=ch[i];
		 
		if(!chmap.containsKey(ch1))
		{
			chmap.put(ch1,i);
		}
		else
		{
			i=chmap.get(ch1);
			chmap.clear();
		}
		if(chmap.size()>lonsunstringlength)
		{
			lonsubstring=chmap.keySet().toString();
		}
	}
	System.out.println("input String:"+inputString);
	System.out.println("input long String:"+lonsubstring);
	System.out.println("input long String length:"+lonsunstringlength);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lonsubstring(" javalanguage");
		System.out.println("input String");
		
	}

}
