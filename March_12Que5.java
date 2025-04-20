/*
Q5.  Map to List Conversion

Write a program that converts a HashMap to a list of entries and then sorts the list by the keys.

 */
package collection;
import java.util.Comparator;
import java.util.*;

public class March_12Que5{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<Integer, Integer> h1 = new HashMap();
		h1.put(80, 100);
		h1.put(20, 200);
		h1.put(6, 300);
		h1.put(17, 400);
		h1.put(60, 500);

		// to convert hashmap to a list of map entries
		// List<Map.Entry<Integer,Integer>> list=new ArrayList<>(h1.entrySet());
         
		Set key=h1.keySet();
        System.out.println("keys "+key);
		Iterator<Integer> i = key.iterator();

		List<String> list = new ArrayList<String>();

		while (i.hasNext()) {
			Integer k=i.next();
            
			list.add(k + " " + h1.get(k));

		}
		System.out.println("list "+list);
		
        // Sort the list based on keys using Comparable (Comparator)
		  Collections.sort(list,new Comparator<String>() {
		  public int compare(String o1,String o2)
		  {
			 // Extract the keys from the strings (before the space)

			  int key1 = Integer.parseInt(o1.split(" ")[0]);
			 // System.out.println("key1 "+key1);
              int key2 = Integer.parseInt(o2.split(" ")[0]);
			 // System.out.println("key2 "+key2);

               //compare the keys
              return Integer.compare(key1,key2);
		  }
		   
	});
		  //print the sorted list
		for (String obj : list) 
			{ 
				System.out.println(obj);
			}
		
		
		
		//list.forEach(x->System.out.println(x));
		
		
		

	}

}
