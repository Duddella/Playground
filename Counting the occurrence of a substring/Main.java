import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String s1=in.nextLine();
    String s2=in.nextLine();
    int l1=s1.length();
    int l2=s2.length();
    int n=l1-l2+1;
    int c=0;
    for(int i=0;i<n;i++)
    {
      int match=1;
      for(int j=0;j<l2;j++)
      {
        if(s1.charAt(i+j)!=s2.charAt(j))
          match=0;
      }
      if(match==1)
        c++;
    }
    System.out.println(c);
  } 
}