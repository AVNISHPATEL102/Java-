import java.util.*;
public class q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the price of the item");
		int price = input.nextInt();
		int quaters = (100-price)/25;
		int dimes = ((100-price)%25)/10;
		int nickels = (((100-price)%25)%10)/5;
		
		System.out.println("So you bought an item priced " + price +"$ and gave me 1$ bill so the change is " +quaters+" quaters\n" + dimes+" dimes\n"+nickels+" nickels.");
		
	}
}
