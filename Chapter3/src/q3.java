import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		boolean repeat = false;
		int choice;
		double inchFather=0,inchMother=0,feetFather=0,feetMother=0;
		double height=0;
		do
		{
			do {
			System.out.println("How would you like to give paren't height in \n 1.inches or \n 2.feet and inches \n please enter 1 or 2");
			choice = input.nextInt();
			}while(choice != 1 && choice != 2);
			
			if (choice ==1)
			{
				System.out.println("Please enter father's height in inch");
				inchFather = input.nextDouble();
				System.out.println("Please enter mother's height in inch");
				inchMother = input.nextDouble();
			}
			if(choice ==2)
			{
				System.out.println("Please enter father's feet of height");
				feetFather = input.nextDouble();
				System.out.println("Please enter mother's feet of height");
				feetMother = input.nextDouble();
				System.out.println("Please enter father's height of inch");
				inchFather = input.nextDouble();
				System.out.println("Please enter mother's height of inch");
				inchMother = input.nextDouble();
				inchFather = inchFather+(feetFather*12);
				inchMother = inchMother + (feetMother*12);
			}
			
			
			do {
			System.out.println("What is the gender of your child ? \n1.male\n2.female\nPlease enter 1 or 2 ");
			choice = input.nextInt();
			}while(choice != 1 && choice != 2);
			
			
			if (choice ==1)
			{
				height = (((inchMother*13)/12)+inchFather)/2;
			}
			if(choice ==2)
			{
				height = (((inchFather*12)/13)+inchMother)/2;

			}
			
			System.out.println("THe height of the chile is " + height +" inches.\nDo you want to check another child's height? \n1.yes\n2.no\nPLease enter 1 or 2");
			choice = input.nextInt();
		}while(choice != 2);
	}

}
