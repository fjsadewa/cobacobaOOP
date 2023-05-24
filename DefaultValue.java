public class DefaultValue
{
	public static void main(String[] args)
	{
		boolean[] b = new boolean[5];
		int[] i = new int[5];
		char[] c = new char[5];
		String[] s = new String[5];

		for(int j=0; j<5; j++)
			System.out.print(b[j]+"-");
		System.out.println();

		for(int j=0; j<5; j++)
			System.out.print(i[j]+"-");
		System.out.println();

		for(int j=0; j<5; j++)
			System.out.print(c[j]+"-");
		System.out.println();

		for(int j=0; j<5; j++)
			System.out.print(s[j]+"-");
		System.out.println();

	}
}
