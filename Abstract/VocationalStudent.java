package Abstract;

import java.util.Date;

public class VocationalStudent extends Student{
	
	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		
		
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
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}


}