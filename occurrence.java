package collection;
import java.util.*;

public class occurrence {
	

	public static void main(String[] args) {
	int j=0;
		
		Scanner s=new Scanner(System.in);
		Vector list=new Vector();
	     do {
	    	 System.out.println("Add the value in list");
	    	 int value=s.nextInt();
	    	 list.add(value);
	    	 s.nextLine();
	    	 System.out.println("do you want to continue?if yes then print y");
	    	 String msg=s.nextLine();
	    	 if(!msg.equals("y"))
	    	 	{
	    		  break;
	    	 	}
			}while(true);
	     System.out.println(list);
	     for(int i=0;i<list.size();i++)
	     {
	    	 Object prev=list.get(j);
	    	 Object curr=list.get(i);
	    	 
	    	 for(j=i+1;j<list.size();j++)
	    	 {
	    		 if((int)prev>(int)curr)
	    		 {
	    			 list.set(i, prev);
	    			list.set(j, curr);

	    		 }
	    	 }
	     }
	     System.out.println("After sorting "+list);
	}

}
