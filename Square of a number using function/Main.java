import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int s=n*n;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int square=square(n);
      System.out.println(square);
	} 
}