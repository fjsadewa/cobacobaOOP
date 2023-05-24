public class ReturnArrays
{
	public static int[] bilanganGanjil(int jml)
	{
		int[] hasil = new int[jml];

		for(int i=0; i<jml; i++)
			hasil[i] = (i*2)+1;

		return hasil;
	}

	public static void main(String[] args)
	{
		int[] bilGanjil;

		bilGanjil=bilanganGanjil(10);
		System.out.print("10 bilangan ganjil pertama : ");

		for(int bil : bilGanjil)
			System.out.print(bil+" ");
	}
}
