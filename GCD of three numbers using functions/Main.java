import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int temp=hcf(n1,n2);
      int gcd=hcf(temp,n3);
      System.out.println(gcd);
	}
  public static int hcf(int n,int m)
  {
    int min;
    int g;
    if(n<m)
      min=n;
    else
      min=m;
    g=min;
    while(min>=1)
    {
      if(n%min==0 && m%min==0)
      {
        g=min;
        break;
      }
      min--;
    }
    return g;
  }
      
      
}