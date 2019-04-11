/*import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int key=in.nextInt();
    int l=str.length();
    for(int i=0;i<l;i++)
    {
      char ch=sb.charAt(i);
      if(ch>='a' && ch<='z');
      {
        int offset=ch-'a';
        offset=(offset-key)%26;
        sb.setCharAt(i,(char)(offset));
      }
       if(ch>='A' && ch<='Z');
      {
        int offset=ch-'A';
        offset=(offset-key)%26;
        sb.setCharAt(i,(char)(offset);
      }
    }
    System.out.println(sb);
      
  }
}*/
import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder text = new StringBuilder(str);
    int m=in.nextInt();
    int n=text.length();
    for(int i=0;i<=n-1;i++)
    {
      char ch = text.charAt(i);
      if(ch>='A' && ch<='Z')
      {
        ch=(char)(ch-m);
        if(ch <'A')
        {
          ch=(char)(ch+26);
        }
      }
      else if(ch>='a' && ch<='z')
      {
        ch=(char)(ch-m);
        if(ch<'a')
        {
          ch=(char)(ch+26);
        }
      }
      text.setCharAt(i,ch);
    }
    System.out.print(text);
  }
}

 