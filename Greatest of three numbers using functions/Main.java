import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int temp=greatest(n1,n2);
      int g=greatest(temp,n3);
      System.out.println(g);
	}
  public static int greatest(int n,int m)
  {
    if(n>m)
      return n;
    else
      return m;
  }
    
}