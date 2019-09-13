import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		double number = input.nextDouble();
		double guess = number/2;
		for(int i = 1 ; i<5;i++)
		{
			
			double r = number/guess;
			guess=(guess+r)/2;
			
			
		}
		System.out.println( "THe square root is " + guess);
	}

}
