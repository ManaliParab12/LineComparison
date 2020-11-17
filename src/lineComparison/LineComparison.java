package lineComparison;

import java.util.Scanner;

public class LineComparison {
	
	public static double distance (double x1, double y1, double x2, double y2) {
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		double dist = Math.sqrt(x + y);
		
		return dist;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to line Comparison Computation Program ");
		Scanner sc = new Scanner(System.in);
		double ax, ay, bx, by, cx, cy, dx, dy;
		System.out.println("Enter ax Coordinates : ");
		ax=sc.nextDouble();
		System.out.println("Enter ay Coordinates : ");
		ay=sc.nextDouble();
		System.out.println("Enter bx Coordinates : ");
		bx=sc.nextDouble();
		System.out.println("Enter by Coordinates : ");
		by=sc.nextDouble();
		System.out.println("Enter cx Coordinates : ");
		cx=sc.nextDouble();
		System.out.println("Enter cy Coordinates : ");
		cy=sc.nextDouble();		
		System.out.println("Enter dx Coordinates : ");
		dx=sc.nextDouble();
		System.out.println("Enter dy Coordinates : ");
		dy=sc.nextDouble();
		double distAB = distance(ax, ay, bx, by);
		double distCD = distance(cx, cy, dx, dy);
	}

}
