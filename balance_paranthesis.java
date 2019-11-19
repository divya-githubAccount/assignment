package stack;
import java.util.*;
public class balance_paranthesis {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String str=sc.next();
	   Stack<Character> st=new Stack<>();
	   for(int i=0;i<str.length();i++)
	   {
		   if(str.charAt(i)=='(' ||str.charAt(i)=='{' || 
				   str.charAt(i)=='[')
		   {
		   st.push(str.charAt(i));
		   }
		   else if((str.charAt(i)==')' && st.peek()=='(') ||
		(str.charAt(i)=='}' && st.peek()=='{') || 
		str.charAt(i)==']' && st.peek()=='[')
		   {
			 st.pop();  
		   }
	   }
		   if(st.isEmpty())
		   {
			   System.out.println("Balanced");
		   }
		   else
		   {
			   System.out.println("Not balanaced");
		   }
	   
   }
}
