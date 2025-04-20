/*Q3. Merging Two Lists
Merge two ArrayList objects into one, making sure that the merged list does not contain duplicates.*/

package collection;
import java.util.*;
public class Collection_12_March_que3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(500);
		al1.add(600);
		al1.addAll(al);
		
		
		
		System.out.println("After 2 arraylist merging "+al1);
		
		HashSet h1=new HashSet(al1);
		System.out.println("After result "+h1);
		
		
	}

}
