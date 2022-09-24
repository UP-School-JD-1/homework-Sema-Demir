package Torbalar;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {

	String minor;
	
	public UndergraduateStudent(int no, String name, int year, Date dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor=minor;
		
	}
	@Override
	public void study() {
		System.out.println("UnderGraduate Student is studying.");
			}

	@Override
	public void register() {
		System.out.println("UnderGraduate Student is registered.");
		
	}
	
	@Override
	public String toString() {
		return "UndergraduateStudent [minor=" + minor + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}