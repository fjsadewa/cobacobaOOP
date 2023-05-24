public class PassingArray
{
	public static void tukar(int[] n, int idx1, int idx2)
	{
		int nilai = n[idx1];
		n[idx1] = n[idx2];
		n[idx2] = nilai;
	}

	public static void main(String[] args)
	{
		int[] bil = {7, 5};

		System.out.println("Nilai bil[0]="+bil[0]+" dan bil[1]="+bil[1]+" sebelum ditukar");
		tukar(bil,0,1);
		System.out.println("Nilai bil[0]="+bil[0]+" dan bil[1]="+bil[1]+" sesudah ditukar");
	}
}
