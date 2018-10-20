package question_5;

public class Even {

	public static void main(String[] args) 
	{
		int num = 10;
		int incre1 = 2, incre2 = 1;
		
		System.out.println("10 - 20 incremented by 2:");
		//Incrementing 2 excluding 16
		while(num <= 20)
		{
			if(num != 16)
				System.out.println(num);
			num = num + incre1;
		}
		num = 10;
		System.out.println("10 - 20 incremented by 1:");
		//Incrementing 1 excluding 16
		while(num <= 20)
		{
			if(num != 16)
				System.out.println(num);
			num = num + incre2;
		}
		num = 10;
		System.out.println("Infinite loops:");
		//continue & break
		while(true)
		{
			if(num == 16)
			{
				num++;
				continue;
			}
			num++;
			System.out.println(num);
			if(num == 20)
				break;	
		}
	}

}
