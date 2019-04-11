import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
           Scanner in=new Scanner(System.in);
		int n=in.nextInt();
      int s;
      while(n > 99)
      {
        n=n/10;
      }
      s=n%10;
      System.out.println(s);
    }
}