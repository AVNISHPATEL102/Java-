import java.util.*;
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of seconds");
		int time = input.nextInt();
		
		int hours = time/3600;
		int min = (time %3600)/60;
		int sec = (time %3600)%60;
		
		System.out.println("Hours " + hours + " min " + min + " sec " + sec);
		
	}

}
