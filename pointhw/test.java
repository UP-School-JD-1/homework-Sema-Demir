package pointhw;

public class test {

	public static void main(String[] args) {
		
		point point1=new point();
		
		point1.setX(1);
		point1.setY(1);
		
		
		System.out.println("Merkeze uzakligi:" + point1.calculateDistanceToOrigin());
		System.out.println("Diger noktaya uzakligi:" + point1.calculateDistanceToOtherPoint(2,5));
		System.out.println("x koordinati:"+ point1.getX());
		System.out.println("y koordinati:"+ point1.getY());
		
		point1.move(2, 6);
		System.out.println("x yeni koordinati:"+ point1.getX());
		System.out.println("y yeni koordinati:"+ point1.getY());
		
		
		
		
	}
		
}
	
