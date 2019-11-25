package Binary_tree;
import java.util.*;
public class prefix_topostfix {
	public static void PreToPost(String str)
	{
	Stack<String> s=new Stack<>();
	for(int i=str.length()-1;i>=0;i--)
	{
	if(str.charAt(i)=='+' ||str.charAt(i)=='-' ||str.charAt(i)=='*'
			||str.charAt(i)=='/')
	{
	String s1=s.pop();
	String s2=s.pop();
	String s3=s1+s2+str.charAt(i);
	s.push(s3);
	}
	else
	s.push(Character.toString(str.charAt(i)));
	}
	System.out.print("Postfix Expression is:- ");
	for(String str1:s)
	System.out.print(str1);
	}
	public static void main(String args[])
	{
		String a=new String();
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		PreToPost(a);
	}
}
