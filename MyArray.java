public class MyArray
{
	public static void main(String[] args)
	{
		final int numStd = 4;
		double[] gpa = new double[numStd];
		String[] name={"Andre", "Bunga", "Christine", "Dedianto"};

		for(int i=0; i<numStd; i++)
			gpa[i] = 3+((double)i/10);

		System.out.printf("%-10s %4s\n","Name","GPA");
		for(int j=0; j<numStd; j++)
			System.out.printf("%-10s %4.2f\n",name[j],gpa[j]);
	}
}
