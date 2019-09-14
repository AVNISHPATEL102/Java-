import java.util.*;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is the price of your item?");
		double price = input.nextDouble();
		System.out.println("What is the monthly interest rate?");
		double interest = input.nextDouble();
		interest = interest/100;
		System.out.println("What is the monthly payment you chose");
		double payment = input.nextDouble();
		int month=0;
		double debt=price;
		int loop=0;
		do
		{
			debt = (debt)-(payment-(debt*interest));
			month++;
			loop++;
			
			
			
		}while(debt >0);
		System.out.println("It will take "+month+" months to pay your debt");
		
	}

}
