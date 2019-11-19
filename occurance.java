package pattern;
import java.util.Scanner;
public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
        	 arr[i]=sc.nextInt();
         }
         int ctr=0;
         int count=0;
         for(int i=0;i<n;i++)
         {
        	 count=1;
        	 if(arr[i]!=-1)
        	 {
        		 for(int j=i+1;j<n;j++)
        		 {
        			 if(arr[i]==arr[j])
        			 {
        			count++;
        			 arr[j]=-1;
        		
        			 }
        		}
        	 
        	 System.out.println(arr[i]+" "+count);
        	 }
         }
	}

}
