package hw12;

import java.util.Objects;

public class Shape {

	double circumference;
	double area;
		

	void draw() {
		System.out.println("sekli ciziliyor");
		
		
	}

	void erase() {
		System.out.println("sekli ciziliyor");
		
	}

	public double calculateArea() {
		System.out.println("seklin alani "+ area);
		return area;
	}

	public double calculateCircumference() {
		System.out.println("seklin cevresi "+ circumference);
		return circumference;
	}

}
