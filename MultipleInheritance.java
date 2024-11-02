import java.util.*;
interface A
{
   public void classA();
   
}

interface B
{
   public void classB();
 
}
class C implements A,B
{
    public void classA()
   {
      System.out.println("This is A class");
   }
   
    public void classB()
   {
      System.out.println("This is B class");
   }
    
}



public class Main {
    public static void main(String[] args) {
      C ob=new C();
      
      ob.classA();
      ob.classB();
     
    
  }
}