import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you would have like tho have the square root of");
		double number = input.nextDouble();
		
		double guess1= number/2;
		double guess2;
		double r;
		boolean check = false;
		while(!check)
		{
			r = number/guess1;
			guess2=(guess1+r)/2;
			double percentage = (guess2/guess1);
			if(percentage >= 0.01)
				{
				check=true;
				System.out.println("the root is" + guess2);
				break;
				}
			guess1=guess2;
			
		}
		
	}

}
