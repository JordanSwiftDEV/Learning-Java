
public class Test {
	public static void main(String[] args){
		int age = 36;
		
		if(age < 50){
			System.out.println("You are young");
			if(age < 35){
				System.out.println("You are REALLY YOUNG");
			}else{
				System.out.println("You aren't that young");	
				}
		}else{
			System.out.println("You are old");
			if (age > 75){
				System.out.println("You are REALLY OLD");
			}else{
				System.out.println("Don't worry you aren't that old");	
			}
		}
	}
}

