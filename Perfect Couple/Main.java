import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int val=in.nextInt();
      int c=0;
      while(c<n)
      {
        for(int i=c+1;i<n;i++)
        {
          if(arr[c]+arr[i]==val)
            System.out.println(arr[c]+", "+arr[i]);
        }
        c++;
      }
    }
}