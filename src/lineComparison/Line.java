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
	 
	 public void lineEquality(Line l1, Line l2) {		
		 
		 if(l1.equals(l2)) {
			 System.out.println("The given lines are equal");		
			 }
		 else {
			 System.out.println("The given lines are not equal");
				 }
		 }
	 
	 public void compare(Line l1, Line l2) {
			
			if(l1.compareTo(l2)==0) {
				System.out.println("The lines are equal");		
			}
			else if(l1.compareTo(l2)<0){
				System.out.println("The First line is smaller than Second line");
			}				
			else if(l1.compareTo(l2)>0){
				System.out.println("The First line is larger than Second line");
			}				
			
		}

		private int compareTo(Line l2) {
			return 0;
		}

}
