import java.util.*;


class A
{
   public void classA()
   {
      System.out.println("This is A class");
   }
 
}

class B extends A
{
   public void classB()
   {
      System.out.println("This is B class");
   }
 
}

public class Main {
    public static void main(String[] args) {
      B ob=new B();
      ob.classB();
      ob.classA();
      
    
  }
}