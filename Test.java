
public class Test {
	public static void main(String[] args){
		int firstarray[][]={{8,9,10,11},{12,13,14,15}};
		int secondarray[][]={{30,31,32,33},{43},{4,5,6}};
		
		System.out.println("This is the first array"); //printing first header on screen
		display(firstarray); //calling method to firstarray
		
		System.out.println("This is the second array"); //printing second header on screen
		display(secondarray); //calling method to secondarray
	}
	
	public static void display(int x[][]){  //pass through a multidementional array
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println(); //print new line after loop gets to end of row
		}
	}
}
