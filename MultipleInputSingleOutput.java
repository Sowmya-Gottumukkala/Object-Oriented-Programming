import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
     String a=sc.next();
      int b=sc.nextInt();
      A ob=new A();
      char c=ob.m5(a,b);
      System.out.println(c);
      System.out.println("string and int as Input and char as  Output");
  }
}
class A
{
   public  char m5(String a,int b)
   {
      return a.charAt(b);
   }
 
}