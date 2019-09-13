import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fileReader = null;
		String line;
		try
		{
			fileReader = new Scanner(new FileInputStream("Sample.rtf"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		line = fileReader.nextLine();
		System.out.println("The text file line: Sample.txt");
		System.out.println(line);
		int position =line.indexOf("hate");
		String changedLine = line.substring(0,position)+"love"+line.substring(position+"hate".length());
		System.out.println(changedLine);
		
	}

}
