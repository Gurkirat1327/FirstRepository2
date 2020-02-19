package javacollection;


import java.util.*;

public class SetCollection {

	public static void main(String[] args) {
		System.out.println("===========HashSet============");
		Set<Integer> grades = new HashSet<>();

		grades.add(55);
		grades.add(85);	
		grades.add(55);	
		grades.add(57);	
		grades.add(75);
		System.out.println(grades);
		System.out.println(grades.remove(85));
		System.out.println(grades);
		
		
		for(int item:grades) {
			System.out.println(item);
		}
		System.out.println(grades.size());
		
		Object[]abc = grades.toArray();
		System.out.println(abc[0]); 
		System.out.println("===========LinkedHashSet============");
		Set<Integer> grades1 = new LinkedHashSet<>();

		grades1.add(55);
		grades1.add(85);	
		grades1.add(55);	
		grades1.add(57);	
		grades1.add(75);
		System.out.println(grades1);
		System.out.println(grades1.remove(85));
		System.out.println(grades1);
		
		
		for(int item:grades) {
			System.out.println(item);
		}
		System.out.println(grades1.size());
		
		System.out.println("===========Treeset============");
		Set<Integer> grades2 = new TreeSet<>();

		grades2.add(55);
		grades2.add(85);	
		grades2.add(55);	
		grades2.add(57);	
		grades2.add(75);
		System.out.println(grades2);
		System.out.println(grades2.remove(85));
		System.out.println(grades2);
		
		
		for(int item:grades2) {
			System.out.println(item);
		}
		System.out.println(grades2.size());
		
		
		
		
		

}
}