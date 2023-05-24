public class WrongArrayDuplication
{
	public static void main(String[] args)
	{
		int [] sourceArray = {2, 3, 1, 5, 10};
		int [] targetArray = new int[5];
		//targetArray = sourceArray;
		//targetArray = sourceArray.clone();
		System.arraycopy(sourceArray, 0, targetArray, 0, 5);

		for(int i=0; i<5; i++)
			System.out.print(targetArray[i]+" ");

		sourceArray[0]=12;
		System.out.println();

		for(int i=0; i<5; i++)
			System.out.print(targetArray[i]+" ");
	}
}
