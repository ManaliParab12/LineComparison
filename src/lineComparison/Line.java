package lineComparison;

public class Line {
	
	double x1,y1,x2,y2; 
	
	public Line(Line l1, Line l2) {
	}
	
	 public Line(double x1, double y1, double x2, double y2) {
		 this.x1 = x1;
		 this.y1 = y1;
		 this.x2 = x2;
		 this.y2 = y2;
		 }
	 
	 public double length (double x1, double y1, double x2, double y2) {		 
			double x = Math.pow(x2 - x1, 2);
			double y = Math.pow(y2 - y1, 2);
			double Length = Math.sqrt(x + y);	
			//double Length = Math.sqrt( Math.pow(x2 - x1, 2)+ Math.pow(y2 - y1, 2));	
			
			return Length;
		}
	 
	 public boolean lineEquality(Line l1, Line l2) {
		 Double lineLength1 = length(x1, y1, x2, y2);
		 Double lineLength2 = length(x1, y1, x2, y2);

		 System.out.println("Length of Line 1 is : " +lineLength1);
		 System.out.println("Length of Line 2 is : " +lineLength2);
		 boolean equal = lineLength1.equals(lineLength2); 		
			 if(equal) {
			 System.out.println("The given lines are equal");		
			 }
		 else {
			 System.out.println("The given lines are not equal");
				 }
			 return equal;
		 }
	 
	 public int compareTo(Line l1, Line l2) {
		 Double lineLength1 = length(x1, y1, x2, y2);
		 Double lineLength2 = length(x1, y1, x2, y2);

		 System.out.println("Length of Line 1 is : " +lineLength1);
		 System.out.println("Length of Line 2 is : " +lineLength2);						 
			int Compare = lineLength1.compareTo(lineLength2);
			if(Compare == 0) {
				System.out.println("The lines are equal");		
			}
			else if(Compare < 0){
				System.out.println("The First line is smaller than Second line");
			}				
			else if(Compare >0){
				System.out.println("The First line is larger than Second line");
			}	
			return Compare;			
		}

}