package collection;
import java.util.*;
class Book
	{
		private int id;
		private int price;
		private String name;
		private String pub;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPub() {
			return pub;
		}
		public void setPub(String pub) {
			this.pub = pub;
		}
	}
public class Book_Stack {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Book b1=new Book();
		Stack s1=new Stack();
		do
		{
			System.out.println("Case 1: Add New Book in Stack ");
			System.out.println("Case 2: View All Books from Stack");
			System.out.println("Case 3: Check Top Most book");
			System.out.println("Case 4: delete book using id from stack");
			System.out.println("Case 5: Search book present in stack or not");
			System.out.println("Case 6: count the total numbers from stack");
			System.out.println("Enter the choice");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the book id");
				int id=s.nextInt();
				s.nextLine();
				System.out.println("Enter the Book Name");
				String name=s.nextLine();
				
				System.out.println("Enter the Publication of the book");
				String pub=s.nextLine();
				
				System.out.println("Enter the price of the book");
				int price=s.nextInt();
				b1.setId(id);
				b1.setName(name);
				b1.setPub(pub);
				b1.setPrice(price);
				s1.add(b1);
				
					break;
				case 2:
					System.out.println("Book Details");
					ListIterator li=s1.listIterator(s1.size());
					if(s1.empty())
						{
							System.out.println("Stack is empty");
						}
					else
						{
						while(li.hasPrevious())
							{
								b1=(Book)li.previous();
								System.out.println("Id:"+b1.getId()+"\t"+"Name:"+b1.getName()+"\t"+"publication:"+b1.getPub()+"\t"+"Price:"+b1.getPrice());
						
							}
						}	
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					System.exit(0);
				default:
				System.out.println("Invalid input");
				break;
			}
		}while(true);

	}

}
