public class Array2D
{
	public static void main(String[]args)
	{
		int[][] array = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
		int total = 0;

		for(int row=0; row<4; row++)
		{
			for(int column=0; column<3; column++)
			{
				System.out.printf("%2d ",array[row][column]);
				total+=array[row][column];
			}
			System.out.println();
		}
		System.out.println("Total: "+total);
	}
}
