import java.util.*;
public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Name of exercise 1");
		String exercise1 = input.next();
		System.out.println("Score received for exercise 1");
		int score1 = input.nextInt();
		System.out.println("Total points possible for exercise 1");
		int high1 = input.nextInt();
		System.out.println("Name of exercise 2");
		String exercise2 = input.next();

		System.out.println("Score received for exercise 2");		
		int score2 = input.nextInt();

		System.out.println("Total points possible for exercise 2");
		int high2 = input.nextInt();

		System.out.println("Name of exercise 3");
		String exercise3 = input.next();

		System.out.println("Score received for exercise 3");
		int score3 = input.nextInt();

		System.out.println("Total points possible for exercise 3");
		int high3 = input.nextInt();
		int total = score1+score2+score3;
		int high = high1+high2+high3;
		System.out.println("Exercise\tScore\tTotal Possible");
		System.out.println(exercise1+"\t"+score1+"\t"+high1);
		System.out.println(exercise2+"\t"+score2+"\t"+high2);
		System.out.println(exercise3+"\t"+score3+"\t"+high3);
		System.out.println("Total"+"\t"+total+"\t"+high);
		System.out.println("The total is " +total+" out of " + high +", or " +((total*100)/high) + " %.");



	}

}
