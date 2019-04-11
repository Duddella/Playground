import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int c[]=new int[n];
      for(int i=0;i<n;i++)
        c[i]=0;
      int count=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==1)
          c[count]++;
        else 
          count++;
      }
      int max=c[0];
      for(int i=0;i<n;i++)
      {
        if(c[i]>max)
          max=c[i];
      }
      System.out.println(max);
        
      }
}