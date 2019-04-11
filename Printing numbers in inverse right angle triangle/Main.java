import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=n;i>0;i--)
      {
        int k=i;
        for(int j=1;j<=i;j++,k--)
          System.out.print(k);
        System.out.print("\n");
      }
	}
}