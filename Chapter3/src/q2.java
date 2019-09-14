import java.util.*;
import java.util.Random;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int win=0;
		int dice;
		int lose=0;
		for(int i =1;i<=10000;i++)
		{
		 dice = rand.nextInt(11)+1;
		if(dice==7 || dice == 11)
			win+=1;
		else if(dice==2 || dice == 3 || dice ==12)
			lose+=1;
		else
		{
			do
			{
				 dice = rand.nextInt(11)+1;
			}while(dice==7 || dice==6 ||dice==5 || dice==4 ||dice==8 || dice==9 ||dice==10);
			
			if(dice==7 )
			lose+=1;
			else
				win+=1;
		}
		
		}
		
		System.out.println("Win = " +win+" Lose = " +lose);
		double probability = ((double)win)/((double)lose+(double) win);
		System.out.println("Probability =" + probability);
		
	}

}
