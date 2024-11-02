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
class C extends B
{
    public void classC()
   {
      System.out.println("This is C class");
   }
    
}
class D extends A
{
    public void classD()
   {
      System.out.println("This is D class");
   }
    
}



public class Main {
    public static void main(String[] args) {
      D ob=new D();
      B ob1=new B();
      C ob2=new C();
      
      ob.classA();
      ob1.classB();
      ob2.classC();
      ob.classD();
     
    
  }
}