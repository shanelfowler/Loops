package question_7;

public class TravelEight {

	public static void main(String[] args) 
	{
		//part 1
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 8; j++)
				System.out.print(8);
			System.out.println();
		}
		System.out.println("----------------");
		//part 2
		for(int i = 0; i < 4; i++)
		{
			for(int j = 4; j >= i; j--)
			{
				if(j > i)
					System.out.print(8);
				else
					System.out.println(" ");
			}
		}
		System.out.println("----------------");
		//part 3
		for(int i = 0; i < 8; i++)
		{
			for(int j = 8; j >= i; j--)
			{
				if(i == j)
					System.out.println(8);
				else
					System.out.print(" ");
			}
		}
	}
}
