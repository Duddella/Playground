import java.util.*;
class Main{
  public static int power(int b,int e)
  {
    int p=1;
    for(int i=1;i<=e;i++)
    {
      p=p*b;
    }
    return p;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
      int base=in.nextInt();
    int exponent=in.nextInt();
    int ans=power(base,exponent);
    System.out.println(ans);
  }
}   