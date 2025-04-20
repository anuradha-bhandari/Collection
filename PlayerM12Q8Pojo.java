package collection;

public class PlayerM12Q8Pojo{
	private int id;
	private String name;
	private int run;

	public PlayerM12Q8Pojo ()
	{
		
	}
	
	public PlayerM12Q8Pojo(int id,String name,int run) 
	{
		this.id=id;
		this.name=name;
		this.run=run;
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

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
  /* public String toString()
   {
	   return id+"\t"+run+"\t"+name;
   }*/
    
}
