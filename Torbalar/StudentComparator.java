package Torbalar;

import java.util.Comparator;


public class StudentComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		AbstractStudent st1 = (AbstractStudent) o1;
		AbstractStudent st2 = (AbstractStudent) o2;
		
		if (st1.getNo()>st2.getNo()) {
			return -1;
		}
		return 0;
		
		
	}
	
}
