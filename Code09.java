// POLYMORPHISM

abstract class A
{
	abstract void polymethod();
	void callme()
	{
	    System.out.println("Inside A's callme");
	}
}

class B extends A
{
	void polymethod()
	{
		System.out.println("Method for polymorphism at class B");
	}

	void callme()
	{
	    System.out.println("Inside B's callme");
	}
}

class C extends A
{
	void polymethod()
	{
		System.out.println("Method for polymorphism at class C");
	}

	void callme()
	{
	    System.out.println("Inside C's callme");
	}

	void test()
	{
	    System.out.println("Inside C's test");
	}
}

class Code09
{
	public static void main(String args[])
	{
		//B b = new B();
		C c = new C();
		A a;

		//a = b;
		a = new B();
		a.polymethod();
		a.callme();

		System.out.println("");

		a = c;
		//a = new C();
		a.polymethod();
		a.callme();
		//a.test();
	}
}