import java.util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("PLease enter the price of the item");
		double price = input.nextDouble();
		System.out.println("PLease enter the number of these items you buy every year");
		int noOfItems = input.nextInt();
		System.out.println("Please enter the yearly inflation rate");
		double inflation = input.nextDouble();
		inflation = inflation/100;
		System.out.println("After how many years do you want to know your total cost ");
		int years = input.nextInt();
		double total = (noOfItems*price)+(noOfItems*price*inflation*years);
		System.out.println("Total of buying these items after " + years+" years would be " + total +"$.");
	} 

}
