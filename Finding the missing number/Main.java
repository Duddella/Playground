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
      int freq[]=new int[n+1];
      for(int i=0;i<n+1;i++)
        freq[i]=0;
      for(int i=0;i<n;i++)
      {
        freq[arr[i]]++;
      }
      for(int i=1;i<n+1;i++)
      {
        if(freq[i]==0)
          System.out.println(i);
      }
    }
}