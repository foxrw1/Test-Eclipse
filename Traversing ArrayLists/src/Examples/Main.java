package Examples;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Fill an ArrayList with random numbers
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 50; i++) {
			list.add((int)(Math.random()*10)); //These are test numbers, the grader will use different ones
		}
		
		System.out.println("List before removing:\n" + list);
		
		//Remove all 5s from the list
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == 5) {
				list.remove(i);
				i--;
			}
		}
		
		System.out.println("List after removing:\n" + list);

	}

}
