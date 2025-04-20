/*
Q4. Finding Common Elements Between Two Sets
Write a program that takes two HashSet objects and prints the elements that are common to both*/

package collection;
import java.util.*;
public class Collection_March_12_Que4 {

	public static void main(String[] args) {
		
       Scanner s=new Scanner(System.in);
       
       HashSet<Integer> s1=new HashSet<Integer>();
       s1.add(100);
       s1.add(200);
       s1.add(400);
       s1.add(700);
       
       HashSet<Integer> s2=new HashSet<Integer>();
       s2.add(100);
       s2.add(300);
       s2.add(400);
       s2.add(700);
       
       HashSet<Integer> em=new HashSet<Integer>();
           /* s1.retainAll(s2);
            
            System.out.println(s1);*/
       
         for(Integer s3:s1)
         {
        	 if(s2.contains(s3))
        	 {

        		 em.add(s3);
        	 }
         }
       
       System.out.println(em);
       
	}

}
