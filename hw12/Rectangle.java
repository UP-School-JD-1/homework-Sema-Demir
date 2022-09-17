package hw12;

import java.util.Objects;

public class Rectangle extends Shape {

	int x;  //uzun kenar
	int y; //kısa kenar
	
	public Rectangle(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	@Override
	void draw() {
		
		System.out.println("Dikdortgen ciziliyor.");
		
		
	}
	
	@Override
	void erase() {
		System.out.println("Dikdortgen siliniyor.");
		
	}
	
	@Override
	public double calculateArea() {
		double area= x*y;
		System.out.println("Dikdortgen alani hesaplandi."+ area);
		return area;
		
		
	}
	
	@Override
	public double calculateCircumference() {
		
		double circumference= 2*(x+y);
		System.out.println("Dikdortgen cevresi hesaplandi."+ circumference);
		return circumference;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(x,y);
		
		
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
