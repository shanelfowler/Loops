package question_1;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		int num = 1;
		
		while(num <= 100)
		{
			if(num % 3 == 0 && num % 5 != 0)
				System.out.println("Fizz");
			else if(num % 3 != 0 && num % 5 == 0)
				System.out.println("Buzz");
			else if(num % 3 == 0 && num % 5 == 0)
				System.out.println("Fizz Buzz");
			else
				System.out.println(num);
			
			num++;
		}
	}
}
