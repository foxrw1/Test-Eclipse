package LessonExamples;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Creating an ArrayList of integer
		ArrayList<Integer> list = new ArrayList<Integer>();		
		
		
		//ArrayLists start empty
		System.out.println(list);
		
		//Add some elements to the end of the ArrayList
		list.add(10);
		list.add(15);
		System.out.println(list);
		
		//Add at a specific index
		list.add(1, 5);
		System.out.println(list);
		
		//Remove from the ArrayList
		list.remove(1);
		System.out.println(list);
		
		//Get element from ArrayList
		System.out.println(list.get(1));
		
		//Set an element in the ArrayList
		list.set(0, 50);
		System.out.println(list);
		
		//Combine set and get to double the element at index 1
		list.set(1, list.get(1) * 2);
		System.out.println(list);
		
		list.add(45);
		list.add(60);
		list.add(75);
		
		//Traditional for loop
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//For- each loop
		for(Integer num : list) {
			System.out.println(num);
		}
		
	}

}

