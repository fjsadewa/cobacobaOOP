public class PassingByValue
{
	public static void tukar(int n1, int n2)
	{
		int nilai = n1;
		n1=n2;
		n2=nilai;
	}

	public static void main(String[] args)
	{
		int bil1=7, bil2=5;

		System.out.println("Nilai bil1="+bil1+" dan bil2="+bil2+" sebelum ditukar");
		tukar(bil1,bil2);
		System.out.println("Nilai bil1="+bil1+" dan bil2="+bil2+" sesudah ditukar");
	}
}
