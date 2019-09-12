
public class q1 {

	public static void main(String[] args) {

		double weight;
		double speed;
		int time;
		int basketballTime;
		int sleepTime;
		
		
		double runMets =10;
		double basketballMets=8;
		double sleepingMets=1;
		
		double calories;
		weight= 150/2.2 ;
		
		System.out.print("Calories burned oer minute:");
		System.out.print((0.0175*weight*30*basketballMets)+(0.0175*weight*30*runMets)+(0.0175*weight*360*sleepingMets));
		
		
		
	}

}
