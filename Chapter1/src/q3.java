import java.util.*;

public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("firstname");
		String firstname = input.nextLine();
		System.out.println("lastname");

		String lastname=input.nextLine();

		String ff = firstname.substring(0,1);
		String cf=firstname.substring(1,2).toUpperCase();
		String bf = firstname.substring(2)	;
		String fl = lastname.substring(0,1);
		String cl=lastname.substring(1,2).toUpperCase();
		String bl = lastname.substring(2);
		
		String pigLatin = cf+bf+ff+"ay "+cl+bl+fl+"ay";
		
		System.out.print(pigLatin);
		
		
		
	
	
	
	}
}
