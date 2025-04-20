package collection;
import java.util.*;
public class ArraylistAPP {

	public static void main(String[] args) 
		{
        	Scanner s=new Scanner(System.in);
        	ArrayList<Integer> list=new ArrayList<Integer>();
        	String msg;
        	do
        	{
        		System.out.println("case 1: add some elements\r\n");
        		System.out.println("case 2: prin t the list\r\n");
        		System.out.println("case 3: remove an element at a specific index.\r\n");
        		System.out.println("Enter your choice");
        		int choice=s.nextInt();
        	 switch(choice)
        	  {
        	 case 1:
        		do{
        		 
           			System.out.println("Add elements in array list");
        			int el=s.nextInt();
        			list.add(el);
        			s.nextLine();
        			System.out.println("Enter the msg yes if u want to continue");
        			msg=s.nextLine();
        		 
        			}while(msg.equals("yes"));
        		break;
        	 case 2:
        		     System.out.println(list);
        		 break;
        	 case 3:
        		 System.out.println("Enter the index to remove value within it");
        		 int indx=s.nextInt();
        		 list.remove(indx);
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


