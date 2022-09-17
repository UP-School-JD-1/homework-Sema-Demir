package hw12;

import java.util.Objects;

public class Triangle extends Shape {

	int x;	//taban
	int y;	
	int z;
	int h;	//yükseklik
	
		public Triangle(int x,int y,int z,int h) {
		
		this.x=x;
		this.y=y;
		this.z=z;
		this.h=h;
	}
	
	@Override
	void draw() {
		
		System.out.println("Ucgen ciziliyor.");
		
		
	}
	
	@Override
	void erase() {
		System.out.println("Ucgen siliniyor.");
		
	}
	
	@Override
	public double calculateArea() {
		double area= (x*h)/2;
		System.out.println("Ucgen alani hesaplandi."+ area);
		return area;
		
		
	}
	

	@Override
	public double calculateCircumference() {
		
		double circumference= x+y+z;
		System.out.println("Ucgen cevresi hesaplandi."+ circumference);
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
	
	

