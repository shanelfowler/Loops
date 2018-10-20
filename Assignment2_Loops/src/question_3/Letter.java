package question_3;
import java.util.Scanner;

public class Letter 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.print("Enter a string: ");
		s = sc.nextLine();
		
		System.out.println("Here are your characters: ");
		for(int i = 0; i < s.length(); i++)
			System.out.println(i+": "+s.charAt(i));
		
		sc.close();

	}
}
