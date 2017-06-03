import java.util.Random;

public class Test {
	public static void main(String[] args){
		Random coin = new Random(); //creating random object
		int number = 1+coin.nextInt(2);
		
		if(number == 1){
			System.out.println("Heads");
		}else{	
			System.out.println("Tails");
	}
}
}
