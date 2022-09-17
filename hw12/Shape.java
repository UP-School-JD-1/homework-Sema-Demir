package hw12;



public class Shape {

	

	double circumference;
	double area;
		

	void draw() {
		System.out.println("Sekil ciziliyor.");
		
	
	}

	void erase() {
		System.out.println("Sekil siliniyor.");
		
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
