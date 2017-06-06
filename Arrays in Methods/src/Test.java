
public class Test {
	public static void main(String[] args){
		int jordan[]={2,3,4,5,6};
		change(jordan);
		
		for(int y:jordan)
			System.out.println(y);
		
	}
	public static void change(int x[]){
		for(int i=0;i<x.length;i++){
			x[i]+=5;
		}
	}
}
