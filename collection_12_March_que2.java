/*Q2. Remove Duplicates Using Set
Write a program that removes duplicate elements from a List using a HashSet and prints the cleaned list.*/

package collection;
import java.util.*;

public class collection_12_March_que2 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(300);
		
		System.out.println("Display the data "+al);
	
		TreeSet h=new TreeSet(al);
		//Collections.sort(h);
		System.out.println("Display the date after removing duplicates "+h);




	}

}
