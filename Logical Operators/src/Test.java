public class Test {
	public static void main(String args []){
		int boy = 18, girl = 70;
		
		if(boy > 10 || girl < 60){ //or logical operator
			System.out.println("You can enter");
		}else{
			System.out.println("You cannot enter");
		}
		if(boy > 10 && girl < 50){ //and logical operator
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}