import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[ ]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int s1=in.nextInt();
      int s2=in.nextInt();
      int e1=0;
      int e2=0;
      int f=0;
      int f1=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==s1)
        {
          f=1;
          e1=i;
          System.out.println(e1);
        }
        else if(arr[i]==s2)
        {
          f1=1;
          e2=i;
          System.out.println(e2);
        }
      }
       if(f==0)
         System.out.println("-1");
        if(f1==0)
          System.out.println("-1");
      
      
      
    }
}