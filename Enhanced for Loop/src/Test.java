
public class Test {
	public static void main(String[] args){
		int jordan[]={3,4,5,6,7};
		int total=0;
		
		for(int x: jordan){ //Example: x = 3, total = 0. total+=x means 0 + 3 (first element in array) + 4 (second element) etc
			total+=x;
		}
		
		System.out.println(total);
	}

}
