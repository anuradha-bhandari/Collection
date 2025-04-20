package collection;
import java.util.*;
public class AddValueArraylist {

	public static void main(String[] args) 
		{
			
		 Scanner s=new Scanner(System.in);
			ArrayList<Integer> al=new ArrayList();
			al.add(100);
			al.add(200);
			al.add(300);
			al.add(400);
			al.add(500);
			al.add(1100);
			al.add(700);
			al.add(800);
			al.add(900);
			al.add(1000);
			
			do {
				System.out.println("\nEnter the choice");
				int choice=s.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Display all elements in Arraylist");
					Iterator i=al.iterator();//check data present or not returns true false
					while(i.hasNext())
					{
						Object obj=i.next();
						System.out.print(" "+obj);
					}
				break;	
				
				case 2:
					 System.out.println("Add new elements in array list");
					 al.add(101);
					 
				break;
				
				case 3:
					System.out.println("Enter value for search");
					int value=s.nextInt();
					boolean b=al.contains(value);
					if(b)
					{
						System.out.println("Value found");
					}
					else
					{
						System.out.println("Value not found");
					}
					
					
				break;
				case 4:
					System.out.println("Elements in descending order");
					 int n=al.size();
					 for(int k=0;k<n-1;k++)
					 {
						 for(int j=k+1;j<n;j++)
						 {
							 if(al.get(k) < al.get(j))
							 {
								 int temp=al.get(k);
								 al.set(k, al.get(j));
								 al.set(j,temp);
							 }
						 }
					 }
					break;
				 case 5:
					System.out.println("Max value in array is");
					int r=al.size();
					int max=0;
					 for(int m=0;m<r;m++)
					 {
							 if(al.get(m)>max)
							 {
								 max=al.get(m);
							 }
					 }
					 System.out.println(max);
					
				  break;
				  case 6:
					
					int min=al.get(0);
					for(int m1=0;m1<al.size();m1++)
					 {
							 if(al.get(m1)<min)
							 {
								 min=al.get(m1);
							 }
					 }
					System.out.println("Min value in arraylist "+min);
					
					break;
					
				 case 7:
					System.out.println("update the value");
					System.out.println("Enter the index where u want to update");
					int indx=s.nextInt();
					
					System.out.println("Enter the value to update");
					int v=s.nextInt();
					 for(int a=0;a<al.size();a++)
					 {
						 if(a==indx)
						 {
							 al.set(indx, v);
						 }
					 }
					break;
				case 8:
					System.out.println("Delete value from arraylist");
					System.out.println("Enter the index where u want to delete");
					int indx1=s.nextInt();
					
					
						for(int a1=indx1;a1<al.size()-1;a1++)					
					     {
							 al.set(a1, al.get(a1+1));
					     }	
						
					       al.remove(al.size()-1);// remove the  last element after shifting
					break;
				case 9:
				 System.exit(0);
				default:
					System.out.println("Invalid inout");
				break;
				}

			}while(true);
		}	

}
