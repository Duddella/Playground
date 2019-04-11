import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String sub=in.nextLine();
      String rep=in.nextLine();
      System.out.println(str.replace(sub,rep));
    }
}