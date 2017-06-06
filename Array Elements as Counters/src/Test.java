import java.util.Random;

public class Test {
	public static void main(String[] args){ //main method
		Random rand = new Random(); //creating random object
		int freq[]= new int[7]; //creating array (not initialized so all elements are = 0. Example: freq[2] = 0, freq[5] = 0)
		
		for(int roll=1;roll<=1000;roll++){ //loop from 1 to 1000
			++freq[1+rand.nextInt(6)]; //pre incrementing number in array and selecting a random number between 1 and 6.
		}
		
		System.out.println("Face\tFrequency"); //array table header
		
		for(int face=1;face<freq.length;face++){ //loop for array table
			System.out.println(face+ "\t" + freq[face]);  //printing the face and the frequency. all numbers in frequency add up to 1000
		}
		
	}

}
