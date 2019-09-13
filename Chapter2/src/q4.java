import java.util.*;
public class q4 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter number of miles you travelled.");
	double distance = input.nextInt();
	System.out.println("THe cost of fuel is 4.56$/gallon");
	System.out.println("The mileage of the car is 26miles/gallon");
	System.out.println("So the cost to travel " + distance + " miles is " + ((distance/26)*4.56) + "$.");
	
	
	
	}
	
	
}
