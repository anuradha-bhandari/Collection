/*
 Q6. Implementing a Simple Phone Book Using HashMap
Create a simple phone book program using a HashMap where the key is a person's name and the value is their phone number.
 */
package collection;
import java.util.*;

public class March_12Que6 {

	public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			HashMap<String,String> h1=new HashMap();
			System.out.println("Enter the size of element to be inserted");
			int size=s.nextInt();
			s.nextLine();
			for(int i=0;i<size;i++)
			{
				System.out.println("Enter the name");
				String name=s.nextLine();
				System.out.println("Enter the phone number");
				String mob=s.nextLine();
				h1.put(name, mob);
			}
			System.out.println("Data Saved Successfully");
			
		 for(Map.Entry<String,String>entry:h1.entrySet())
			{
				System.out.println("Name "+entry.getKey()+"\t"+"Mobile number "+entry.getValue());
			}
			
		}

}
