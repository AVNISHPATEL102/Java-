
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double concentration =0.001;
		double mouseWeight =0.02;
		double mouseDeath = 0.001;
		double friendWeight = 120;
		double friendDeath = 90;
		
		double fatalsoda= (mouseWeight/mouseDeath)*friendWeight/concentration;
		
		System.out.println("the amount of soda friend can drink is" + fatalsoda);
	}

}
