/*Q7. List Reversal Using LinkedList
Write a program that reverses the order of elements in a LinkedList using an iterator.
 */
package collection;
import java.util.*;

public class March_12Que7 {

	public static void main(String[] args) {
		
      Scanner s=new Scanner(System.in);
      List l1=new LinkedList();
      
      l1.add(100);
      l1.add(200);
      l1.add(300);
      l1.add(400);
      l1.add(500);
      
      Iterator<Integer> i=l1.iterator();
      //create empty linkedlist
      LinkedList<Integer> l2=new LinkedList<Integer>();
      
      while(i.hasNext())
      {
    	 Integer element =i.next();
    	 l2.addFirst(element);
      }
      System.out.println("Reverse of an Elements in linkedlist "+l2);
	}

}
