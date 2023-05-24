interface Warna
{
	/*final*/ String wrn = "Hijau";
	/*abstract public*/ void printWarna();
}

abstract class Bentuk implements Warna //extends Object
{
	public Bentuk()
	{
		System.out.println("Constructor Bentuk");
	}

	public void cetak()
	{
		System.out.println("Ini class Bentuk");
	}

	abstract void luas();
	abstract void keliling();
}

class Segitiga extends Bentuk
{
	static
	{
		System.out.println("Sebelum Constructor Segitiga");
	}

	public Segitiga()
	{
		System.out.println("Constructor Segitiga");
	}

	public void cetak()
	{
		System.out.println("Ini class Segitiga");
	}

	void luas()
	{
		System.out.println("Luas Segitiga = 0.5 a x t");
	}

	void keliling()
	{
		System.out.println("Kel Segitiga = alas + sisi + sisi");
	}

	public void printWarna()
	{
		System.out.println("Warna "+wrn);
	}
}

class Segiempat extends Bentuk
{
	static
	{
		System.out.println("Sebelum Constructor Segiempat");
	}

	public Segiempat()
	{
		System.out.println("Constructor Segiempat");
	}

	public void cetak()
	{
		System.out.println("Ini class Segiempat");
	}

	public void cetakInduk()
	{
		super.cetak();
	}

	void luas()
	{
		System.out.println("Luas Segiempat = a x t");
	}

	void keliling()
	{
		System.out.println("Kel Segiempat = 2a + 2t");
	}

	public void printWarna()
	{
		System.out.println("Warna "+wrn);
	}
}

public class BelajarInheritance {

	public static void main(String[] args) {
		Segitiga objst = new Segitiga();
		Segiempat objse = new Segiempat();
		Segiempat objse2 = new Segiempat();
		Bentuk objbtk;
		int menu = 2;

		//objst.cetak();
		//objse.cetak();
		//objse.cetakInduk();
		objbtk = objst;

		switch(menu)
		{
			case 1: objbtk = objst; break;
			case 2: objbtk = objse; break;
		}

		objbtk.cetak();
		objbtk.printWarna();

		if(objbtk instanceof Segitiga)
			System.out.println("Sedang menunjuk class Segitiga");
		else
		if(objbtk instanceof Segiempat)
			System.out.println("Sedang menunjuk class Segiempat");
		//System.out.println(objse.toString());
	}

}
