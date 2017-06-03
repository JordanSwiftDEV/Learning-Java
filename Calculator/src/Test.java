import java.util.Scanner;

public class Test {
	public static void main(String args[]){
		Scanner jordan = new Scanner(System.in);
		double firstnumber, secondnumber, answer;
		System.out.println("Enter first number: ");
		firstnumber = jordan.nextDouble();
		System.out.println("Enter second number: ");
		secondnumber = jordan.nextDouble();
		answer = firstnumber + secondnumber;
		System.out.println("The answer is " + answer);
	}

}
