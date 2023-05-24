public class ArrayLength
{
	public static void main(String[] args)
	{
		int[] number = new int[10];
		int[][] table = new int[5][10];

		System.out.println("Length of array 1 dimension : "+number.length);
		System.out.println("Length of array 2 dimension : "+table.length+" x "+table[0].length);
	}
}
