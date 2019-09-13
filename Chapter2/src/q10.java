import java.util.*;
public class q10 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the name of the first item:");
	String firstItem = input.next();	
	System.out.println("How much quantity are you taking of it?");
	int quantity1 = input.nextInt();
	System.out.println("PLease enter the price of " + firstItem);
	double price1 = input.nextDouble();
	
	
	System.out.println("Please enter the name of the second item:");
	String secondItem = input.next();	
	
	System.out.println("How much quantity are you taking of it?");
	int quantity2 = input.nextInt();
	System.out.println("PLease enter the price of " + secondItem);
	double price2 = input.nextDouble();
	
	
	System.out.println("Please enter the name of the first item:");
	String thirdItem = input.next();	
	System.out.println("How much quantity are you taking of it?");
	int quantity3 = input.nextInt();
	System.out.println("PLease enter the price of " + thirdItem);
	double price3 = input.nextDouble();
	
	double total = ((quantity1*price1)+(quantity2*price2)+(quantity3*price3));
	System.out.println("Your bill:");
	System.out.println("Item\tQuantity\tPrice\tTotal");
	System.out.println(firstItem+"\t"+quantity1+"\t"+price1+"\t"+(quantity1*price1));
	System.out.println(secondItem+"\t"+quantity2+"\t"+price2+"\t"+(quantity2*price2));
	System.out.println(thirdItem+"\t"+quantity3+"\t"+price3+"\t"+(quantity3*price3));
	System.out.println("Subtotal\t" + total);
	System.out.println("6.25% sales tax\t" + (total*0.0625) );
	System.out.println("Total\t" + (total+(total*0.0625)));
	
	}
}
