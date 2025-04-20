package collection;
import java.util.*;
public class March_12Q8ImplementorId implements Comparator{
	public int compare(Object o1,Object o2)
	{
		PlayerM12Q8Pojo p1=(PlayerM12Q8Pojo)o1;
		PlayerM12Q8Pojo p2=(PlayerM12Q8Pojo)o2;
		
			if(p1.getId()>p2.getId())
			{
				return 1;
			}
		else if(p1.getId()<p2.getId())
			{
				return -1;
			}
		 else
		  {
			return 0;
		 }
	}
        
}
