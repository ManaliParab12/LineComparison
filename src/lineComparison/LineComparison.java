package lineComparison;

import java.util.Scanner;

import line.Line;


public class LineComparison {
	
	public static double length (double x1, double y1, double x2, double y2) {
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		double dist = Math.sqrt(x + y);
		
		return dist;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3, x4, y4;
		
		System.out.println("Enter x1 Coordinates : ");
		x1=sc.nextDouble();
		System.out.println("Enter y1 Coordinates : ");
		y1=sc.nextDouble();
		System.out.println("Enter x2 Coordinates : ");
		x2=sc.nextDouble();
		System.out.println("Enter y2 Coordinates : ");
		y2=sc.nextDouble();
		System.out.println("Enter x3 Coordinates : ");
		x3=sc.nextDouble();
		System.out.println("Enter y3 Coordinates : ");
		y3=sc.nextDouble();		
		System.out.println("Enter x4 Coordinates : ");
		x4=sc.nextDouble();
		System.out.println("Enter y4 Coordinates : ");
		y4=sc.nextDouble();
		
		double lineLength1 = length(x1, y1, x2, y2);
		double lineLength2 = length(x3, y3, x4, y4);
		
		System.out.println("Length of Line 1 is : " +lineLength1);
		System.out.println("Length of Line 2 is : " +lineLength2);
		
		Line l1 = new Line(x1, y1, x2, y2);
		Line l2 = new Line(x3, y3, x4, y4);
		
		Line l = new Line(l1,l2);
		l.lineEquality(l1, l2);
	
	
	}

}
