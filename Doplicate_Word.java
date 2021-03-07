package testyntra_string_pro;

import java.util.HashSet;
import java.util.Set;

public class Doplicate_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]={"nil","uhu","uhu","nil","nilf"};

	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i].equals(str[j]))
			{
				System.out.println("Druplicate word is-->"+str[i]);
			}
		}
	}
	//using HasSat: Store unique value
	Set<String> Store = new HashSet<String>();
	for(String s: str)
	{
		//its iterate by name and if already add then give false
		if(Store.add(s)==false)
		{
			System.out.println("Druplicate word is-->"+s);
		}
	}
	
	
	// Using HashMap:
}

	}



