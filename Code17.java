// SYNCHRONIZED

class NewThread extends Thread
{
	Synch target;
	String msg;

	NewThread(Synch t,String m)
	{
		target=t;
		msg=m;
		start();
	}

	public void run()
	{
		// jika void cetak tidak di-synchronized
		// maka di sini tambahkan synchronized(objek) (atau keduanya)
		// bandingkan program tanpa synchronized

		//synchronized(target)
		{
			target.cetak(msg);
			System.out.println();
		}
	}
}

class Synch
{
	// jika pemanggil tidak di-synchronized
	// maka di sini tambahkan modifier synchronized (atau keduanya)
	// bandingkan program tanpa synchronized

	//synchronized void cetak(String msg)
	void cetak(String msg)
	{
		try
		{
			System.out.print("[");
			Thread.sleep(1000);
			System.out.print(msg);
			Thread.sleep(1000);
			System.out.print("]");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}

class Code17
{
	public static void main(String args[])
	{
		Synch a=new Synch();
		NewThread coba = new NewThread(a,"First");
		NewThread coba2 = new NewThread(a,"Second");
		System.out.println("Main thread end");
	}
}

