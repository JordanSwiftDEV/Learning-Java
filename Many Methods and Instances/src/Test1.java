import java.util.Scanner;

public class Test1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Test2 test2obj = new Test2();
		System.out.println("Enter name of first girlfriend here:");
		
		String temp = input.nextLine();
		test2obj.setName(temp);
	    test2obj.saying();
	}

}
