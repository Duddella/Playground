import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int o=in.nextInt();
      if(n>m && n>o)
        System.out.println(n);
      else if(m>n && m>o)
        System.out.println(m);
      else
        System.out.println(o);
    }
}