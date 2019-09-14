import java.util.*;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("Enter the kth fibonacci number you want to know");
		int kth = input.nextInt();
		int f1=1;
		int f2 =1;
		int n=1;
		int t=0;
		if(kth==1 || kth ==2)
			System.out.println(f1);
		else
		{
		
			while(n<kth)
			{
				t =f1+f2;
				f1=f2;
				f2=t;
				n++;
			}
			System.out.println("Your "+kth+"th fibonacci number is " + t+".");
		}
		
		
	}

}
