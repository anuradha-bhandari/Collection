/*
Q8. Sorting a List of Objects Using Comparator
Write a program that sorts a list of custom objects using a Comparator and displays the sorted list.
Note: you have to create Player objects in with field id,name and run and sort the player record using following terms
Case 1: sort player by id
Case 2: sort player by run
 */
package collection;
import java.util.*;
public class March_12Que8 {

	 public static void main(String[] args) {
     List<PlayerM12Q8Pojo> list=new ArrayList<PlayerM12Q8Pojo>();
     PlayerM12Q8Pojo p1=new PlayerM12Q8Pojo(1,"ANU",1000); 
     PlayerM12Q8Pojo p2=new PlayerM12Q8Pojo(4,"Radha",2000); 
     PlayerM12Q8Pojo p3=new PlayerM12Q8Pojo(2,"Sejal",500);
     PlayerM12Q8Pojo p4=new PlayerM12Q8Pojo(3,"Sneha",1000);
     PlayerM12Q8Pojo p5=new PlayerM12Q8Pojo(5,"Praji",7000);
     
     list.add(p1);
     list.add(p2);
     list.add(p3);
     list.add(p4);
     list.add(p5);
     
     System.out.println("Display the records before sorting");
     System.out.println("Id"+"\t"+"Name"+"\t"+"Run");
     for(PlayerM12Q8Pojo obj:list)
     	{
    	 	System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getRun());
     	}
     
          Comparator c=new March_12Q8ImplementorId();
          Collections.sort(list,c);
          
          
          System.out.println("Display the records after sorting by id");
          System.out.println("Id"+"\t"+"Name"+"\t"+"Run");
          for(PlayerM12Q8Pojo obj:list)
          	{
         	 	System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getRun());
          	}
          
          c=new March_12Q8ImplementorRun();
          Collections.sort(list,c);
          
          System.out.println("Display the records after sorting by Run");
          System.out.println("Id"+"\t"+"Name"+"\t"+"Run");
          for(PlayerM12Q8Pojo obj:list)
          	{
         	 	System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getRun());
          	}
     
     
     
	}

}
