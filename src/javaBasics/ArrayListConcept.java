package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		//problems in Array - dataType restriction/size restriction/less number of defined methods
		// Why ArrayList - no dataType restriction/size restriction/lot of defined methods
		
		ArrayList a = new ArrayList();
		a.add("Java");
		a.add("100");
		a.add(true);
		a.add('x');
		
		System.out.println(a.get(2)); // get() is to get the value out
		System.out.println(a.get(0));
		System.out.println(a.size());
		
		// index count starts from 0 and row count starts from 1
		
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		
		ArrayList<String> b = new ArrayList<String>(); //Parametrized arrayList
		b.add("Tom");
		b.add("John");
		b.add("Eva");
		
		System.out.println(b.contains("Tommy")); // contains() = checking if present or not
		System.out.println(b.contains("tom"));
		
		System.out.println(b.equals("Eva"));
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("Tom");
		c.add("John");
		c.add("Eva");
		
		System.out.println(b.equals(c));
		
		System.out.println("Position of John is "+b.indexOf("John"));
		b.add("Jacky");
		b.add("Tom"); // duplicate can be added
		for(String x : b) { //it is all called for each loop
			System.out.print(x+" ");
		}
		b.remove(4); // remove() - removes the value in the specific index
		System.out.println(" ");
		for(String x : b) {
			System.out.print(x+" ");
		}
		System.out.println(c.size());
		c.removeAll(c); // removeAll() method removes all the value from the desired arrayList
		System.out.println(c.size());
		
		Iterator<String> it =  b.iterator();
		System.out.println(it);
		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 3 ways to traverse
		// 1. for loop
		
		// 2. for each loop
		// 3. traversing with the use of iterator
		
		
		
		
		
		
		
	}
	
	
		

}
