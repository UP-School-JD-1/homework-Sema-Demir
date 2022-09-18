package InstanceOf;

import java.util.Date;

public class RegistrationOffice {
	
	
	public Student getAStudent() {
		Date date = new Date();
		Student s = null;
		
		int i = (int) (6 * Math.random());
		
		switch (i) {
		
		case 0:
			s = new VocationalStudent(1, "VocationalStudent-Eda", 2019, date, "Industrial Engineering");
			break;
		case 1:
			s = new GraduateStudent(2, "Graduate-Buse", 2015, date , "Medicine", "ilac", "beslenme");
			break;
		case 2:
			s = new UndergraduateStudent(3, "Undergraduate-Ogun", 2021, date , "Industrial Engineering", "lojistik");
			break;
		case 3:
			s = new MasterStudent(4, "MasterStudent-Esma", 2013, date, "psychology", "Zehra", "brain");
			break;
		case 4:
			s = new PhdStudent(5, "PhdStudent-Nisa", 2022, date, "Literature", "Ali", "Literature", false);
			break;
		}
		return s;
		
	}
		
	public void registerStudent(Student student) {
		
		if(student instanceof VocationalStudent) {
			System.out.println("VocationalStudent " + student.getName() + " is registered.");
		}
		
		if(student instanceof GraduateStudent) {
			System.out.println("GraduateStudent " + student.getName() + " is registered.");
		}
		
		if(student instanceof UndergraduateStudent) {
			System.out.println("UndergraduateStudent " + student.getName() + " is registered.");
		}
		
		if(student instanceof MasterStudent) {
			System.out.println("MasterStudent " + student.getName() + " is registered.");
		}
		
		if(student instanceof PhdStudent) {
			System.out.println("PhdStudent " + student.getName() + " is registered.");
		}
		
	
	}
	}
