package collection;

import java.util.Collections;

public class Employee implements Comparable {
	private int id;
	private String name;
	private double sal;
     public Employee()
      {
    	 
      }
     public Employee(int id,String name,double sal)
     {
    	this.id=id;
    	this.name=name;
    	this.sal=sal;
     }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public int compareTo(Object o)
	{
		Employee e1=(Employee)o;
		if(e1.getSal()<this.sal)
		{
			return 1;
		}
		else if(e1.getSal()>this.sal)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

}
