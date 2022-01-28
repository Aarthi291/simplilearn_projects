//2.5Constructors

package Constructors;

public class Construct {
	private String name;

	  // constructor
	 void  Main() {
	    System.out.println("Constructor Called:");
	    name = "Programiz";
	  }

	  public static void main(String[] args) {

	    
		  Construct   obj = new Construct();
	    System.out.println("The name is " + obj.name);
	  }
	}


