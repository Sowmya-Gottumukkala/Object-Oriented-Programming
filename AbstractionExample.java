package Abstraction;

	abstract class Shape 
	{
	    
	    public abstract void draw();
	    
	  
	    public void display() 
	    {
	        System.out.println("This is a shape.");
	    }
	}

	class Circle extends Shape
	{
	  
	    public void draw() 
	    {
	        System.out.println("Drawing a Circle");
	    }
	}

	class Rectangle extends Shape
	{
	
	    public void draw() 
	    {
	        System.out.println("Drawing a Rectangle");
	    }
	}

	public class abstraction
	{
	    public static void main(String[] args)
	    {
	        Shape circle = new Circle();     
	        Shape rectangle = new Rectangle(); 

	        circle.display();  
	        circle.draw();     

	        rectangle.display(); 
	        rectangle.draw();   
	    }
	}
