/*Q3.Stack Implementation - Implement a stack using Stack 
  case 1: push()
  case 2: pop()
  case 3: peek() operations.
  case 4: display stack value using last in first out */


package collection;
import java.util.*;
public class StackApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stack<Integer>s1=new Stack();
		do
		{
			System.out.println("Enter the choice");
			int choice=s.nextInt();
		switch(choice)
		{
		  case 1:	
		  String msg;
	      do
	       {
	      	 System.out.println("Add the elements in stack");
	    	 int ele=s.nextInt();
	    	 s1.push(ele); 
	    	 s.nextLine();

	    	  System.out.println("Enter the msg y if u want to continue");
	    	  msg=s.nextLine();
	        }while(msg.equals("y"));
		 break; 
		 
		case 2:
			System.out.println("delete the last element from stack");
			s1.pop();
			System.out.println(s1);
			
			break;
		case 3:
			System.out.println(s1);
			System.out.println("Display the last element in stack "+s1.peek());
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Invalid input");
			break;
		}	
			
		}while(true);
		
	}

}
