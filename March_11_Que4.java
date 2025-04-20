package collection;
import java.util.*;
public class March_11_Que4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashSet h1=new HashSet();
		
		System.out.println(" case 1: add elements to the set\r\n");
		System.out.println(" case 2:checking if an element exists\r\n");
		System.out.println(" case 3: finding the size of the set.");

		
		do
		{
			System.out.println("Enter the choice");
			int choice=s.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("add elements to the set\r\n");
				h1.add(100);
				h1.add(800);
				h1.add(300);
				h1.add(200);
				System.out.println(h1);
				
				break;
			case 2:
					System.out.println("checking if an element exists\r\n");
					if(h1.isEmpty())
						{
							System.out.println("Set is Empty");
						}
					else
						{
							System.out.println("Set is not Empty");
						}
					
				break;
			case 3:
				 System.out.println("Size of the set "+h1.size());
				 
				break;
			case 4:
				System.out.println("Exit the program");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
			}
			
		}while(true);

	}

}
