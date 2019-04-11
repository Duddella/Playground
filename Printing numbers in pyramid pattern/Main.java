import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=1;
      int k=1;
      for(int i=n;i>0;i--,k++)
      {
        for(int sp=1;sp<=i-1;sp++)
          System.out.print(" ");
        for(int j=1;j<=k;j++)
        {
          System.out.print(num+" ");
          num++;
        }
        System.out.print("\n");
      }
    }    
}