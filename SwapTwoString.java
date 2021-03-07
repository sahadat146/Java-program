package testyntra_string_pro;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="javs";
String b="selenium";
System.out.println("srtring before swaping");
System.out.println("a="+a+"b="+b);
a=a+b;
b=a.substring(0,a.length()-b.length());
a=a.substring(b.length());
System.out.println("srtring after swaping");
System.out.println("a="+a+"b="+b);
	}
}
