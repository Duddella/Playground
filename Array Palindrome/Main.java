import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
      int palin=1;
      int f=0;
      int l=n-1;
      while(f<l)
      {
        if(arr[f]==arr[l])
        {
          f++;
          l--;
        }
        else
        {
          palin=0;
          break;
        }
      }
      if(palin==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}