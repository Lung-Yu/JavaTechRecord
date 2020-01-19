package ClassOderby;

import java.util.Comparator;

public class ClassComparator implements Comparator<Class<?>>{

	@Override
	public int compare(Class<?> o1, Class<?> o2) {
		// TODO Auto-generated method stub
		if(o1.equals(o2))
			return 0;
		else if(o1.isAssignableFrom(o2))
			return -1;
		else if (o2.isAssignableFrom(o1)) {
			return 1;
		}else
			throw new IllegalArgumentException("兩個類別之間沒有關係");
	}
	
}
