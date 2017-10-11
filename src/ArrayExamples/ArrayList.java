// have an array that I made that consists of first names. I have a search function that searches through the elements of the array and it works fine

package ArrayExamples;

	import java.util.*;

	public class ArrayList {
	    @SuppressWarnings("unused")
		public static void main(String[] args) {

	    @SuppressWarnings("resource")
		Scanner search = new Scanner(System.in); 
	       String[] firstName = new String[]{"John", "Thomas", "Samuel", "Chris", "Daniel", "Joey", "David", "Joshua", "Michael", "John"};
	       Arrays.sort(firstName);
	       System.out.print("Enter a search term: ");
	       String name = search.next();

	       int i;

	       boolean foundIt = false;

	    search:
	       for (i = 0; i < firstName.length; i++) {
	           if (firstName[i] == name) {
	                   foundIt = true;

	               }
	           }


	       if (foundIt = true){
	            System.out.println("Your search term of " + name + " produced " + name + " search results");
	       }

	       else {
	           System.out.println("Your search term of " + name + " did not return any results");
	       }
	   }
	}


