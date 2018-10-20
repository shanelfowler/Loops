package question_2;
import java.util.Scanner;

public class HalvingMachine 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numHold;
		
		System.out.print("Enter a value for the machine: ");
		numHold = input.nextInt();
		
		while(numHold <= 0)
		{
			System.out.print("Hey! That's against the rules! Try again: ");
			numHold = input.nextInt();
		}
		System.out.println("You've entered: "+numHold);
		while(numHold != 1)
		{
			if(numHold % 2 != 0)
				numHold = (numHold + 1) / 2;		
			else
				numHold = numHold / 2;
			
			System.out.println("The Machine Gave: "+numHold);		
		}
		input.close();
	}
}
