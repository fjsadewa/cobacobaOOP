public class VarArgsDemo
{
	public static void printMax(double... numbers)
	{
		if(numbers.length==0)
		{
			System.out.println("No argument passed");
			return;
		}

		double result=numbers[0];

		for(double num : numbers)
			if(num>result)
				result=num;

		System.out.println("The max value is "+result);
	}

	public static void main(String[] args)
	{
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[] {3, 2, 3});
	}
}
