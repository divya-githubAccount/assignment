package myproject1;
import java.util.Scanner; 
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String original;
        Scanner sc=new Scanner(System.in);
        original=sc.next();
        int i=0,len=0;
        try
        {
        while(true)
        {
        	original.charAt(len);
        	len++;
        }
        }
        catch(Exception e)
        {
        	
        }
       
        for(int j=len-1;j>=0;j--)
        {
        	System.out.print(original.charAt(j));
        }
	}

}
