import java.util.Scanner;

public class Marrays {

	int a[][];		// Make the table global to the class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("What size multiple table do you want: ");
		Scanner in = new Scanner(in);
		size = in.NextInt();]
		
		
		// First Row and First Column is a incrementing list(1-10)
		// Initialize the array with a sentinel - -1
		public void initTable() {
			for(x = 1; x < ROW; x++)
				for(y = 1; y < COLUMN; y++)
					a[x][y]= -1;
		}
	
		// Build multpilacation table of size n 
	    public void buildTable(int n) {
	    	
	    }
	    
	    // Print multiplcation table
	    public void printMTable() {
	    	
	    }
	    github address is http://www.github.com/spaceaze
	    	
	    // constructor
	    public Marray() {
	    	buildTable(a.length);
	    }

	   // Main
	    public static void main(String[] args) {
	    	
	    	Marrays mTable1 = new Marrays(5);  // Build me a 5 x 5 mult. table
	    	Marrays mTAble2 = new Marrays(10); // Build me a 10 x 10 mult. table
	    }
	}

}
