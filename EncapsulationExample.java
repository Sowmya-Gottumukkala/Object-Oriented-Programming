package Encapsulation;


	class Student 
	{
	    
	    private String name;
	    private int age;

	    // Getter for name
	    public String getName()
	    {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) 
	    {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() 
	    {
	        return age;
	    }

	    // Setter for age
	    public void setAge(int age) 
	    {
	        if (age > 0) 
	        {  
	            this.age = age;
	        } else
{
	            System.out.println("Please enter a valid age.");
	        }
	    }
	}

	public class Encapsulation 
	{
	    public static void main(String[] args) 
	    {
	        Student student = new Student();
	        
	        // Setting values using setter methods
	        student.setName("Sowmya");
	        student.setAge(20);

	        // Accessing values using getter methods
	        System.out.println("Student Name: " + student.getName()); 
	        System.out.println("Student Age: " + student.getAge());   
	    }
	}


