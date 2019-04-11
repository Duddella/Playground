import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num;
      int o=n;
      //int f=1;
      int sn=0;
      while(n != 0)
      {
        num=n%10;
        int f=1;
        if(num==0)
      		f=1;
    	else
    	{
    		for(int i=1;i<=num;i++)
    		{
      			f=f*i;
    		}
    	}
        n=n/10;
        sn=sn+f;
      }
      if(sn==o)
      	System.out.println("Yes");
      else
        System.out.println("No");
  }
}