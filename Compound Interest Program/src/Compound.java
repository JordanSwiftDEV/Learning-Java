
public class Compound {
	public static void main(String[] args){
		//foruma: Amount = Principle(1 + rate)^number of days
		double amount;
		double principle = 10000;
		double rate = 0.01;
		
		for(int days=1;days<=20;days++){
			amount = principle*Math.pow(1 + rate, days);
					System.out.println(days +"    " + amount);
		}
	}

}
