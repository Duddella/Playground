import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int len=str.length();
      int front=0;
      int end=len-1;
      int palin=1;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          palin=0;
          break;
        }
        front++;
        end--;
      }
      if(palin==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}