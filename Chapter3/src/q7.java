import java.util.*;
public class q7 {
	 public static long factorial(int number) {
	        long result = 1;

	        for (int factor = 2; factor <= number; factor++) {
	            result *= factor;
	        }

	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value of x");
		int x = input.nextInt();
		System.out.println("Please enter the value of n");
		int n = input.nextInt();
		
		
		double value=1 ;
		
		for(int i=1;i<=n;i++)
		{
			value=value+(Math.pow(x, i))/factorial(i);
		}
		
		System.out.println("The value of the function" + value);
		
	}

}
