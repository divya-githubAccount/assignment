import java.util.Scanner;
public class subarray
{
  public static void main(String args[])
  {
    int count=0,x=0;
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int sum=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      count=arr[i];


    for(int j=i+1;j<n;j++)
    {
      count=count+arr[j];
      if(count==sum)
      {
        x++;
        System.out.println("Starting index: "+i);
        System.out.println("Ending index: "+j);
      }
    }
  }
  if(x==0)
  {
    System.out.println("Invalid input");
  }
  }
}
