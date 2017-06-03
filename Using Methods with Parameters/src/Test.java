import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Test2 Test2object = new Test2();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		Test2object.simpleMessage(name);
	}

}
