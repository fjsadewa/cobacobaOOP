// THREAD USING INTERFACE RUNNABLE AND EXTENDS THREAD

class Code15
{
    public static void main(String args[])
    {
		System.out.println("void main is beginning");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
		new newThread();
		new baruThread();
		System.out.println("Returning to void main");
		try
		{
			for (int i=3;i>0;i--)
			{
				System.out.println("Main Thread  : " + i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
    }
}

class newThread implements Runnable
{
	private Thread t;

	newThread()
	{
		t = new Thread(this,"NewThread");
		// jika bertemu thread lain, maka thread ini akan dijalankan
		// setelah thread lain dengan prioritas lebih besar jalan
		t.setPriority(1);
		System.out.println("Child Thread [newThread]  : " + t +" is beginning");
		try
		{	t.sleep(1000);
		}
		catch(Exception e)
		{
		}
		t.start();
		for(int i=2;i>0;i--)
		{
			System.out.println("MainThread in newThread after start [start] : "+i);
			try
			{	t.sleep(500);
			}
			catch(Exception e)
			{
			}
		}
		System.out.println("MainThread in newThread after start [end]");
	}

	public void run()
	{
		try
		{	for (int i=5;i>0;i--)
			{	System.out.println("Child Thread [newThread]  : " + i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{	System.out.println("Child Interrupted in newThread");
		}
		System.out.println("Exiting Child Thread in newThread");
	}
}

class baruThread extends Thread
{
	baruThread()
	{
		super("baruThread");
		System.out.println("Child Thread [baruThread] : " + this +" is beginning");
		try
		{
			sleep(1000);
		}
		catch(Exception e)
		{
		}
		start();
		// jika bertemu thread lain, maka thread ini akan dijalankan
		// sebelum thread lain dengan prioritas lebih kecil jalan
		setPriority(10);
		for(int i=2;i>0;i--)
		{	System.out.println("MainThread in baruThread after start [start] : "+i);
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{
			}
		}
		System.out.println("MainThread in baruThread after start [end]");
	}

	public void run()
	{
		try
		{
			for (int i=3;i>0;i--)
			{
				System.out.println("Child Thread [baruThread] : " + i);
				sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Child Interrupted in baruThread");
		}
		System.out.println("Exiting Child Thread in baruThread");
	}
}