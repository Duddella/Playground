import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=1;
      for(int i=n;i>0;i--)
      {
        for(int space=1;space<=i-1;space++)
          System.out.print(" ");
        for(int j=1;j<=c;j++)
          System.out.print("*");
        c=c+2;
        System.out.print("\n");
      }
 
	}
}