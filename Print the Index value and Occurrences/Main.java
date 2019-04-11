import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner in=new Scanner(System.in);
      String pString=in.nextLine();
      String txt=in.nextLine();
      Pattern p=Pattern.compile(pString);
      Matcher m=p.matcher(txt);
      int count=0;
      while(m.find())
      {
        count++;
        System.out.println("found: "+ count + " : "+ m.start() + " - " + m.end());
      }
        if(count==0)
        System.out.println("The given word is not present in the string");
        else
          System.out.println(count);
      }
    
    
}