package lineComparison;

public class Point {
	
	double x,y; 
	
	public Point(double x, double y)  
	{ 
		this.x = x; 
		this.y = y; 
		} 
	static void displayPoint(Point p) 
	{ 
		System.out.println("(" + p.x + ", " + p.y + ")"); 
		} 
	}
