package testyntra_string_pro;

public class CountNoofSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi      hello how are you";
		String []ch=str.split("");
		int count=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			
			
				if(ch[i].equals(" "))
				{
					count++;
									}
			}
		System.out.println(count);

		}
	}


