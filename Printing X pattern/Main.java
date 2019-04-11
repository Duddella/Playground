import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<n;i++)
      {
        int j=n-1-i;
        for(int k=0;k<n;k++)
        {
          if(k==i||k==j)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
	}
}