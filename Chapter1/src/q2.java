import java.util.*;
public class q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter how many number of coupons do you have");
		
		int coupons = input.nextInt();
		
		int candy= coupons/10;
		int gumballs = (coupons%10)/3;
		
		System.out.println("You can get " + candy+" candybars and " + gumballs + " gumballs");
		
	}
}
