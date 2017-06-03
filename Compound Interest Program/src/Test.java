
public class Test {
	public static void main(String[] args){
		double amount;
		double principle = 10000;
		double rate = .01;
		
		for(int day=1;day<=20;day++){
			amount=principle*Math.pow(1 + rate, day); //forumula for compound interest. Amount = principle(1 + rate)^number of years
			System.out.println(day + "    " + amount);
		}
		
	}

}
