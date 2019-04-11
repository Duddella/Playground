import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here 
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m,d,r=0;
    while(n!=0)
    {
      m=n;
      n=n/10;
      d=m%10;
      r=(r*10)+d;
    }
    System.out.println(r);
    
  }
}