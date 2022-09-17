package hw12;


	public class ShapeTest{
		
	public static void main(String[] args) {
	

	Circle circle1= new Circle(4);
	
	circle1.draw();
	circle1.calculateArea();
	circle1.calculateCircumference();
	circle1.erase();
	
	
	Rectangle rectangle1 = new Rectangle(2,4);
	rectangle1.draw();
	rectangle1.calculateArea();
	rectangle1.calculateCircumference();
	rectangle1.erase();
	
	
	Square square1 = new Square(8);
	square1.draw();
	square1.calculateArea();
	square1.calculateCircumference();
	square1.erase();
	
	
	
	Triangle triangle1 = new Triangle(6,2,3,4);
	triangle1.draw();
	triangle1.calculateArea();
	triangle1.calculateCircumference();
	triangle1.erase();
	

	}
}
	
	
