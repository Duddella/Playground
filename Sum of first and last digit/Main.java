import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
           Scanner in=new Scanner(System.in);
		int n=in.nextInt();
      int f;
      int l;
      l=n%10;
      int sum;
      while(n>10)
      {
        n=n/10;
      }
      f=n;
      sum=f+l;
      System.out.println(sum);
	}
}