import java.util.*;
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("PLease enter the gear size:");
		double gear = input.nextDouble();
		System.out.println("PLease enter the cadence");
		double cadence = input.nextDouble();
		
		double speed = gear*3.14*((double) (1)/(12*5280))*cadence*60;
		System.out.println(speed);
	}

}
