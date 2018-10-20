package question_6;
import java.util.Scanner;

public class Expressions {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double num1, num2, val;
		String exp;
		char op;
		
		System.out.print("The rules are simple enter the expression "
						+"you would like to be evaluated.\n"
						+"Type 0 when you want to exit: ");
		while(true)
		{
			num1 = in.nextDouble();
			if(num1 == 0)
				break;
			System.out.print(num1+" ");
			
			exp = in.next();
			System.out.print(exp+" ");
			op = exp.charAt(0);
			
			num2 = in.nextDouble();
			System.out.print(num2+"\n");
			
			switch(op)
			{
				case '+':   val = num1 + num2;
							System.out.print("Sum: "+val);
							break;
				case '-':	val = num1 - num2;
							System.out.print("Difference: "+val);
							break;
				case '*':	val = num1 * num2;
							System.out.print("Product: "+val);
							break;
				case '/':	val = num1 + num2;
							System.out.print("Quotient: "+val);
							break;
				default:	System.out.println("Invalid operator.");
							continue;
			}
		}
		
		in.close();

	}
}
