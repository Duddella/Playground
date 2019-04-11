import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int org_num=n;
      int count=0;
      int ams_num=0;
      int d;
      while(n!=0)
      {
        n=n/10;
        count++;
      }
      //System.out.println(count);
      while(temp!=0)
      {
        d=temp%10;
        int num=1;
        for(int i=1;i<=count;i++)
        {
          num=num*d;
        }
        ams_num=ams_num+num;
        temp=temp/10;
      }
      if(org_num==ams_num)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
        
	}
}