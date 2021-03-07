package testyntra_string_pro;

public class OccEach_charOf_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                                                                                                        
		String str="selenium tool austomotionm";
	    String str1=str.replaceAll(" "," ");
		 //String[] str1=str.split(" ");
					
				
		char[]ch=str1.toCharArray();
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
		if(count>0&&ch[i]!='0')
		{
			System.out.println("cheracter---->:"+ch[i]+"--->has_occured------>"+count+"------>times");
		}
		}
		
	}

}
