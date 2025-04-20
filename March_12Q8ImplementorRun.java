package collection;
import java.util.*;
public class March_12Q8ImplementorRun implements Comparator {
	public int compare(Object o1,Object o2)
	{
		PlayerM12Q8Pojo  r1=(PlayerM12Q8Pojo )o1;
		PlayerM12Q8Pojo  r2=(PlayerM12Q8Pojo )o2;
		if(r1.getRun()>r2.getRun())
		{
			return 1;
		}
		
		else if(r1.getRun()<r2.getRun())
			{
				return -1;
			}
		else
	 		{
				return 0;
	 		}
		
	}
}
