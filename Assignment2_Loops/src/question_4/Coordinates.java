package question_4;
import java.util.Scanner;

public class Coordinates
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x, y;
	
		
		System.out.print("Maximum x: ");
		x = in.nextInt();
		
		System.out.print("\nMaximum y: ");
		y = in.nextInt();
		
		for(int i = 0; i <= x; i++)
		{
			for(int j = 0; j <= y; j++)
				System.out.println("("+i+","+j+")");
		}
		in.close();
	}
}
