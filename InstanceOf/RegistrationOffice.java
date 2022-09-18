package InstanceOf;

import java.util.Date;

	public class RegistrationOffice {
		
		
		public Student getAStudent() {
			Date date = new Date();
			Student s = null;
			
			int i = (int) (6 * Math.random());
			
			switch (i) {
			case 0:
				
				s = new Student(1, "Student-Kadir", 2017, date, "Law");
				break;
			
			case 1:
				s = new VocationalStudent(2, "VocationalStudent-Eda", 2019, date, "Industrial Engineering");
				break;
			case 2:
				s = new GraduateStudent(3, "Graduate-Buse", 2015, date , "Medicine", "ilac", "beslenme");
				break;
			case 3:
				s = new UndergraduateStudent(4, "Undergraduate-Ogun", 2021, date , "Industrial Engineering", "lojistik");
				break;
			case 4:
				s = new MasterStudent(5, "MasterStudent-Esma", 2013, date, "psychology", "Zehra", "brain");
				break;
			case 5:
				s = new PhdStudent(6, "PhdStudent-Nisa", 2022, date, "Literature", "Ali", "Literature", false);
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
		
