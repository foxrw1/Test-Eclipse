package ManipulateElements;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <=5; i++) {
			list.add(i); //These are test numbers, the grader will use different ones
		}
		
		//Call the function to modify the list
		modifyArrayList(list);		
		
	
		//Display final result	
		System.out.println(list);

	}
	
	public static void modifyArrayList(ArrayList<Integer> list) {
		//You will add code that modifies list
		//Write one line of code for each modification
		
		//1. Add the number 7 at index 2
		list.add(2, 7);
		//2. Set the element at index 3 to 50
		list.set(3, 50);
		//3. Set the 1st element to the sum of the 2nd and 3rd elements
		list.set(0, list.get(1) + list.get(2));
		//4. Remove the last element in the list
		//   Hint: list.size() will return the number of elements
		list.remove(list.size() - 1);
		//5. Set the last element of the list to twice the first
		list.set(list.size() - 1, list.get(0) * 2);
	}

}
