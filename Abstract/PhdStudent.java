package Abstract;

import java.util.Date;


public class PhdStudent extends MasterStudent {

	
	boolean qualifyingExamToken;
	
	
	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamToken ) {
		super(no, name, year, dob, major, advisor, thesis);
		
		this.qualifyingExamToken=qualifyingExamToken;
		
		
	}
	public void writePaper() {
			System.out.println("Phd Student is writing paper.");
		
	}
			@Override
			public void writeThesis() {
				System.out.println("PhD Student writing thesis about "+ thesis);
				
				
			}
			@Override
			public void meetWithAdvisor() {
				System.out.println("PhD Student is on a meeting with advisor about "+ thesis);
				
			}
			@Override
				public void study() {
				System.out.println("PhD Student is studying");
				
			}
			@Override
				public void register() {
				System.out.println("PhD Student has just registered");

				
			}

	
}
