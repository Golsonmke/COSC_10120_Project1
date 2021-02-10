
import java.util.*;
/**
 * COSC 1020 Sec.101 8am
 * Professor Nadiyah Johnson
 * @author Gary Olson
 *
 */
public class Polygon {

	public static void main(String[] args) {
		
		
		//Display title and function of program
		System.out.println("Welcome to the Polygonal Property Calculator!");
		
		//Print space in out put widow
		System.out.println();
		
		//Instance of the scanner class to read user input
		Scanner in = new Scanner(System.in);
		
		//get user input for first name
		System.out.print("Enter your first name:\t\t\t");
		String firstName = in.nextLine();
		
		//get user input for last name
		System.out.print("Enter your last name:\t\t\t");
		String lastName = in.nextLine();
		
		
		//get user input for property number of sides/// 
		System.out.print("Enter sides the property has:\t\t");
		int sides = in.nextInt();
		
		//get user input for length in meters
		System.out.print("Enter side length in meters:\t\t");
		double length = in.nextDouble();
		
		//get user input for cost per square meter
		System.out.print("Enter property cost per square meter:\t$");
		double propCost = in.nextDouble();
		
		//get user input for fence cost per meter
		System.out.print("Enter fence cost per meter:\t\t$");
		double fenceCostPerMeter = in.nextDouble();
		
		//Print space in out put widow
		System.out.println();
		
		//Convert degree to radians
		double radians = Math.toRadians(180); //3.14
		
		//Calculate apothem
		double apothem = length / (2 * Math.tan(radians / sides));
		
		//Calculate area
		double area = 0.5 * sides * length * apothem;
		
		//Calculate perimeter
		double perimeter = sides * length;
		
		//Calculate Interior angle
		double angle = 180 * ((double)sides -2) / (double)sides;
		
		//Calculate cost of land
		double landCost = propCost * area;
		
		//Calculate the cost of fencing around perimeter
		double fenceCost = fenceCostPerMeter * perimeter;
		
		//Calculate the total cost of polygonial property 
		double totalCost = landCost + fenceCost;
		
		System.out.println();
		
		//Display property info title and first initial and last name
		System.out.println("Property Information for " + firstName.charAt(0) + ". " + lastName); 
		
		//For loop to print line of 64 astrisks
			for (int i=0; i<65; i++){
			    System.out.print("*");
			}
		//Print space in out put widow
			System.out.println();
		
		//Display formatted results from calculations and user input.
		System.out.printf("Total area:\t\t\t\t" + "%.3f\n",area);    
		System.out.printf("Total perimeter:\t\t\t" + "%.3f\n", perimeter);
		System.out.printf("Length of apothem:\t\t\t" + "%.3f\n",apothem);
		System.out.printf("Interior angle:\t\t\t\t" + "%.3f\n",angle);
		System.out.printf("Cost of land:\t\t\t\t$" + "%.2f\n",landCost);
		System.out.printf("Cost of fencing:\t\t\t$" + "%.2f\n",fenceCost);
		System.out.printf("Total cost:\t\t\t\t$" + "%.2f\n",totalCost);
		
		//Print space in output widow
		System.out.println();
		
		//Display title for loan info section
		System.out.println("Loan Information");
		//For loop to print line of 64 astrisks
			for (int i=0; i<65; i++){
			    System.out.print("*");
			}
		
		//Print space in out put widow
			System.out.println();
			
		//Get annual interest rate from user
		System.out.print("Enter annual interest rate:\t\t");
		double annualInterestRate = in.nextDouble();
		
		//Get length of loan in years from user
		System.out.print("Enter length of loan in years:\t\t");
		int loanYears = in.nextInt();
		
		//Calculate total cost plus interest
		double CostWithInterest = totalCost * Math.pow( 1 + annualInterestRate, loanYears);
		
		//Display the total coat with interest
		System.out.printf("Total cost with interest:\t\t$" + "%.2f\n",CostWithInterest);
		
		//Close scanner to prevent leaks
		in.close();
		
	}

	
}
