import java.util.*;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("PLease enter the purchase value");
		double purchase = input.nextDouble();
		System.out.println("Please enter the salvage value");
		double salvage = input.nextDouble();
		System.out.println("Please enter number of years you used it");
		double years = input.nextDouble();
		System.out.println("So the yearly depreciation for the item is " +((purchase-salvage)/years));
	}

}
