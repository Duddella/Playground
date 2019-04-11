import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int len=sb.length();
      int freq[]=new int[26];
      for(int i=0;i<26;i++)
        freq[i]=0;
      for(int i=0;i<len;i++)
      {
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
        {
          int off=sb.charAt(i)-'a';
          freq[off]++;
        }
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          int off=sb.charAt(i)-'A';
          freq[off]++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(freq[i]==0)
        {
          char ch=(char)('a'+i);
          System.out.print(ch+" ");
        }
      }
        
    }
}