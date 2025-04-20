/*Case 5: HashMap Basic Operations
Create a HashMap to store key-value pairs, and perform operations such as insertion, deletion, and retrieval.
*/
package collection;
import java.util.*;

public class March_11_que5 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1=new HashMap();	
		
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Case 1:Insertion");
			System.out.println("Case 2:Deletion");
			System.out.println("Case 3:Retrieval");
			
			System.out.println("Enter ur choice");
			int choice=s.nextInt();
			switch(choice)
				{
			      case 1:
			    	   h1.put(1, "anu");
			    	   h1.put(2, "radha");
			    	   h1.put(3, "rani");
			    	   h1.put(4, "jonny");
			           break;
			      case 2:
			    	 /* System.out.println("Enter index value you want to remove");
			    	  int i=s.nextInt();
			    	  Object value=h1.remove(i);
			    	  System.out.println("Remove successfully "+h1);*/
			    	  
			    	  System.out.println("Enter the key value you want to remove");
			    	  int key=s.nextInt();
			    	  if(h1.containsKey(key))
			    	  {
			    		  h1.remove(key);
			    		  System.out.println("Removed successfully.");
			    	  }
			    	  else
			    	  {
			    		  System.out.println("Key not found!");
			    	  }
			    	  break;
			      case 3:
			    	    
			    	  	if(h1.isEmpty())
			    	  	{
			    	  		System.out.println("the hashmap is empty");
			    	  	}
			    	  	else
			    	  	{
			    	  		for (Map.Entry<Integer, String> entry : h1.entrySet()) {
	                            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	                        }
			    	  	}
			    	  break;
			          case 4:
			    	  System.out.println("Exit the program");
			    	  System.exit(0);
			    	  break;
			    	  default:
			    		  System.out.println("Invalid Input");
			    	  break;
			    	  
      			}
			
		}while(true);
	
	}

}
