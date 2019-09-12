import java.util.*;
public class q9 {
	public static void main(String[] args) {
		// NOT A BIG DEAL PLEASE REFER THE TEXTBOOK FOR THIS 
		Scanner input = new Scanner(System.in);
		System.out.println("PLease enter feet");
		int feet = input.nextInt();
		System.out.println("Please enter inches");
		int inch = input.nextInt();
		
		int weight = 110 + ((feet-5)*10 + inch)*5 ; 
		System.out.println(weight);
	}
}
