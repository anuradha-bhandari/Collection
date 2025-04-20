/*Q2. LinkedList Implementation
Create a LinkedList of strings, 
 case 1: add some element
 case 2: print the list
 case 3: remove elements from the front and rear.*/

package collection;
import java.util.*;
public class LinkedListApp {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<Integer>();
	  do
	  {
		  System.out.println("Enter your choice");
		  int choice=s.nextInt();
		  switch(choice)
		  {
		  case 1:
		    list.add(40);
			list.add(50);
			list.add(60);
			list.add(70);
			list.add(80);
		  break;
		  case 2:
			System.out.println(list);
		  break;
		  case 3:
			  System.out.println("After removing first and last elements");
			  System.out.println(list.removeFirst());
			  System.out.println(list.removeLast());

		   break;
		  case 4:
			  System.exit(0);
		  default:
			  System.out.println("Invalid choice");
			  break;
		  }
	  }while(true);		
	}

}
