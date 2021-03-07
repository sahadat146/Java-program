package testyntra_string_pro;

public class Duplict_word_therNoOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String str="hi hi hi hello hello hello how how eu";
		String[]ch=str.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i].equals(ch[j]))
{
	count++;
	ch[j]="";
}
			}
			if(count>1&&ch[i]!="")
{
System.out.println(ch[i]+"---->has occured-->"+count+"-->times");
}
		}
		
	}

}
