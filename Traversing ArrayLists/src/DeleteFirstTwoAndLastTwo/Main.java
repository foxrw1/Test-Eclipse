package DeleteFirstTwoAndLastTwo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Fill an ArrayList with the numbers 1-10
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			list.add(i); //These are test numbers, the grader will use different ones
		}
		
		System.out.println("Before removing first 2 and last 2:\n" + list);
		
		removeElements(list); //You will complete this method
		
		System.out.println("After removing first 2 and last 2:\n" + list);
		
		
	}
	
	
	public static ArrayList<Integer> removeElements(ArrayList<Integer> list) {
		//Your code to remove the first two elements and the last two elements from list
		list.remove(0);
		list.remove(0);
		list.remove(list.size()-1);
		list.remove(list.size()-1);
		
		//Do not modify this line
		return list;		
	}
}
