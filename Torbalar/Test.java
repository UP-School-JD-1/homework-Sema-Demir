package Torbalar;

public class Test {

	
	public static void main(String[] args) {
		
		RegistrationOffice regOff= new RegistrationOffice();
		
		AbstractStudent student = regOff.getAStudent();		
		
		System.out.println("Student name: " + student.getName());
		System.out.println("Student's Major: " + student.getMajor());
		System.out.println("Year: " + student.getYear());
		System.out.println("No: " + student.getNo());
		
	
	}
}