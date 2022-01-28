import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int first, second, add, subtract, multiply,div;
	    
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    first = scanner.nextInt();
	    second = scanner.nextInt();

	    add = first + second;
	    subtract = first - second;
	    multiply = first * second;
	    div = first / second;

	    System.out.println("Addition = " + add);
	    System.out.println("Subtraction = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + div);

	}

}
