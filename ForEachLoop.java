public class ForEachLoop
{
	public static void main(String[] args)
	{
		double[] myList = new double[10];

		for(int i=0; i<myList.length; i++)
			myList[i] = (double)i/10;

		for(double myListValue : myList)
			System.out.println(myListValue+" ");
	}
}
