package testyntra_string_pro;

import java.util.Scanner;

public class Totle_NO_of_occurance_of_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
String str="hi i hi hello ofe nfnieo";
char []ch=str.toCharArray();
System.out.println("Input String is");
Scanner sc=new Scanner(System.in);
char ch1=sc.next().charAt(0);
for(int i=0;i<ch.length-1;i++)
{
	if(ch1==ch[i])
	{
		count++;
	}
}
System.out.println("cheracter---:"+ch1+"-->has occured-->"+count+"<---times");
	}

}
//(something mistake)ymnythmn 