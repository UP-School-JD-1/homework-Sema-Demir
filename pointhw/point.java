package pointhw;

public class point {

		int x;
		int y;
		
	public point(int x,int y) {
		this.x=x;
		this.y=y;
		
		
	}
		
	
	public point(int x) {
		
		this(x,0);
		
	}
	
	public point() {
		this(0,0);
		
		
	}
		
	public int getX() {
		return x;
		
	}
	
	public void setX(int x) {
		this.x=x;
		
	}
	public int getY() {
		return y;
		
	}
	
	public void setY(int y) {
		this.y=y;
	
	}
		public double calculateDistanceToOrigin() {
			double distance1= Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
			
			return distance1;
		
		}
		
		public double calculateDistanceToOtherPoint(int x, int y) {
			
			double distance2=Math.sqrt(x*this.x)+ (y*this.y);
		
			return distance2;
			
		}
		
		
		public point clone (int x, int y) {
			return new point();
			
			
		}
		
		
		public void move(int x, int y) {
		
		
			int x1 = getX();
			int y1 = getY();
		
			int newX= x+x1;
			setX(newX);
			int newY= y+y1;
			setY(newY);
			
		
		}
		
		
}