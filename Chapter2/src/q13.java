import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fileReader=null;
		String line;
		try
		{
			fileReader = new Scanner(new File("/Users/mr.a/Desktop/eclipse/Chapter2/src/Height.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		for(int i=0;i<3;i++) {
		line = fileReader.nextLine();
		System.out.println("The text file line: Height.txt");
		System.out.println(line);
		int a = fileReader.nextInt();
		int b= fileReader.nextInt();
		fileReader.nextLine();
		int weight = ((((a-5)*12)+b)*5)+110;
		System.out.println(weight);
		}
	}

}
