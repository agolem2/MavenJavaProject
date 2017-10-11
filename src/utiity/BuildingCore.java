package utiity;

/**Describe the principles of Object-oriented programming
Class inheritance
Interface implementation
Abstraction of data and behavior
Encapsulation of data and class implementation
Polymorphism and virtual methods.


Explain the polymorphism principle and how it used in the Java language.
An organism or species can have many different forms or stages. Subclasses of a class can define their own unique behaviors 
and yet share some of the same functionality of the parent class.

Explain the encapsulation principle and how it is used in the Java language.
Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as as single unit

Explain the inheritance principle and how it is used in the Java language.
the principle of class hierarchy. It is the ability for one object to take on the states, behaviors, and functionality of 
another object.

What is the difference between an abstract class and an interface? When to use each?
An interface is an empty shell, there are only the signatures of the methods, which implies that the methods do not have a 
body. The interface can't do anything. It's just a pattern.

Abstract classes, unlike interfaces, are classes. They are more expensive to use because there is a look-up to do when you 
inherit from them.

What is a static method? When is it used?
Static methods in java belong to the class (not an instance of it). They use no instance variables and will usually take 
input from the parameters, perform actions on it, then return some result. Instances methods are associated with objects
 and, as the name implies, can use instance variables.

What is a static variable? When is it used?
Any variable declared within a method is supposed to be local to the method (It gets stored in the method stack in the JVM, 
which is one per thread), and static variables are common to all objects of a class (obviously a class can be invoked by many
 threads - each thread can invoke different object of the same class), ...

What is the difference between a Java List and a Java Set?
A Set cannot contain duplicate elements while a List can.

How do you prevent a class from being subclassed in Java? (2 ways) without final? Make all constructors of class a private

What is the difference between a Java Hash Table and a Java HashMap?
Hashtable is synchronized whereas hashmap is not. 2)Another difference is that iterator in the HashMap is fail-safe while 
the enumerator for the Hashtable isn't. If you change the map while iterating, you'll know. 3)HashMap permits null values
 in it, while Hashtable doesn't

What are the differences between == and .equals()?
"==" is used to compareprimitives while equals() method is recommended to check equality of objects

What is meant by pass by reference and pass by value in Java?
This is because Java passes the object reference 'by value'. When an object is passed as argument to a method, 
actually the reference to that object is passed. 

The formal parameter is a mapping of the reference to the actual parameter

What do you understand by the java “final” keyword?
In Java we use final keyword to variables to make its values not to be changed.

Can you override a private method
Private methods are not inherited and cannot be overridden in any way

Can you override a constructor
A sub class is a different class and must have its own constructor. So, constructors simply can't be overridden. 

Explain serialization?
Serialization usually refers to the process of converting an abstract datatype to a stream of bytes (You sometimes 
serialize to text, XML or CSV or other formats as well. 


*/



//Java - object-oriented programming language, your primary goal is to describe classes and objects.

// Java has two different kinds of words - Keywords and Identifiers

// A keyword is a word that has its own special meaning in the Java programming language,

// An identifier is a name for something

// In Java, the entire program is a class. 

//class, is a Java keyword


/**The entire program Otherwise Known as the Class Displayer
 
 main method header 

public class main BuildingCore {

	private static Logger Log = Logger.getLogger(logger.class.getName()));
	private WebDriver driver;
	private static StringBuffer verificationsErrors = new StringBuffer();
	
	static java.util.Date date= new java.utilDate();
	static Time stamp t = new Times tamp (date.getTime()));
	static Sting dateNow = t.toString().replace":","_");
	String object = "Screenshots";
	String className = this.getClass().getSimpleName();
		
	
   	public static void main(String args[]) {
       System.out.println("You'll love Java!");
   }
}
￼
The class Displayer
 
*/

//Your primary goal is to describe classes and objects through methods
//In Java, a method is a list of things to do

public class BuildingCore {
	
		
		// The word main plays a special role in Java. In particular
		// you never write code that explicitly calls a main (name) method into action.
		
		//Initializing variables

	   // Local variables - Local variables are declared in methods, constructors, or blocks.

	   // Instance variables - Instance variables are declared in a class, but outside a method, constructor or any block.

	    // Class/static variables - Class variables also known as static variables are declared with the static keyword in 
		// a class, but outside a method, constructor or a block.

		// Here’s a statement that creates an object:
	
		//amountInAccount = new amountInAccount();
		
		//amountInAccount = 50.00;
		
		//amountInAccount = amountInAccount + 1000.00;
		

	}
	


