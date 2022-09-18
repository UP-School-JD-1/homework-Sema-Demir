package Interface;

import java.util.Date;




public class GraduateStudent extends AbstractStudent{
	
	String advisor;
	String thesis;
	

public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
	super(no, name, year, dob, major);
	this.advisor = advisor;
	this.thesis = thesis;
}

	public void writeThesis() {
	System.out.println("Graduate Student writing thesis about "+ thesis);
	
}
	public void meetWithAdvisor() {
	System.out.println("Graduate Student is on a meeting with advisor about "+ thesis);
	
}

	@Override
	public void study() {
		System.out.println("Graduate Student is studying.");
			}

	@Override
	public void register() {
		System.out.println("Graduate Student is registered.");
		
	
}


}
	