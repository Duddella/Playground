import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String sub=in.nextLine();
      String temp=str.concat(str);
      if(temp.contains(sub))
     // if(flag=="true")
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}