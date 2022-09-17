package hw12;

import java.util.Objects;

public class Circle extends Shape  {

	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
				
	}
	
	@Override
	void draw () {
	super.draw();
		
	}
	
	@Override
	void erase() {
	super.erase();;
		
	}
	
	@Override
	public double calculateArea() {
		
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("Daire alani hesaplandi "+ area);
		
		return area;
	}
	
	@Override
	public double calculateCircumference() {
		double circumference=2*Math.PI*radius;
		System.out.println("Daire cevresi hesaplandi "+ circumference );
		return circumference;
		
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(radius);
		
		
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
	
	@Override
	public String toString(){
		return "Circle [radius= " + radius + "]";
		
		
	}
	
	
	
}


