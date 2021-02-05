package FindTheAverage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Fill an ArrayList with the numbers 1-10
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			list.add(i); //These are test numbers, the grader will use different ones
		}
		
			
		double result = findMean(list); //You will complete this method
		
		System.out.println("The mean value of list = " + result);
		
		
		
	}
	
	//POST: computes and returns the mean value of list
	public static double findMean(ArrayList<Integer> list) {
		double mean = 0;
		
		//Compute the mean here by adding all the elements together
		//and dividing by the number of elements
		double sum = 0;
		for(Integer i : list) {
			sum += i;
		}
		mean = sum / list.size();
		
		
		//Do not modify this line
		return mean;		
	}
}
