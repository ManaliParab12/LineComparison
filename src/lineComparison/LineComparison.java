package lineComparison;

import java.util.Scanner;

public class LineComparison {
	
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
		
		
		Line l1 = new Line(x1, y1, x2, y2);
		Line l2 = new Line(x3, y3, x4, y4);		
		Line l = new Line(l1,l2);
		l.lineEquality(l1, l2);
		l.compareTo(l1,l2);	
	}

}
