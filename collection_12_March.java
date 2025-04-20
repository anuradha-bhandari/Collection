/*Q1. Sorting an ArrayList
Create an ArrayList of custom objects and sort them using Collections.sort() based on a specific field.
Example: you have to create Employee class with field id,name and salary and sort employee data by using salary
*/

package collection;
import java.util.*;
public class collection_12_March
{

		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			ArrayList al=new ArrayList();
			
			Employee e1=new Employee(1,"ABC",30000);
			al.add(e1);
			
			Employee e2=new Employee(2,"pqr",300);
			al.add(e2);
			
			Employee e3=new Employee(3,"opq",10000);
			al.add(e3);
			
			System.out.println("Display the recors without sorting");
			for(Object obj:al)
			{
				Employee e=(Employee)obj;
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
			}
			 Collections.sort(al);
			System.out.println("Display the records after sorting");
			
			for(Object obj:al)
			{
				Employee e=(Employee)obj;
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
			}
			
		}

}
