package hw12;

import java.util.Objects;

public class Square extends Shape {

	int x; // her iki kenar
	
	public Square(int x) {
		
		this.x=x;
		
	}
	
	@Override
	void draw() {
		
		super.draw();
		
		
	}
	
	@Override
	void erase() {
	super.erase();
		
	}
	
	@Override
	public double calculateArea() {
		double area= x*x;
		System.out.println("Kare alani hesaplandi."+ area);
		return area;
		
		
	}
	

	@Override
	public double calculateCircumference() {
		
		double circumference= 2*(x+x);
		System.out.println("Kare cevresi hesaplandi."+ circumference);
		return circumference;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(x);
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		else
			return false;
	}
	

		
	
	
}
	
	

