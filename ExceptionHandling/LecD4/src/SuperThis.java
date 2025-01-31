import java.util .*;

class D2{
	D2(){}
	D2(String name)
	{System.out.println("D2 (String name )");
	}
	void abc()
	{System.out.println("Hi XYZ moethod ...! ");
	}
}
class B extends D2{
	B()
	{	this(100); // same class with 1 paramanet construtor
		System.out.println("Hi B()");
	}
	
	B(int a)
	{	super("Thanesh"); // super class with 1 paramanet construtor
		System.out.println("Hi B(int a)");
	}
	void abc()
	{	super.abc();// same class with no arg method
	System.out.println("Hi ABC moethod ...! ");
	}
}

class SuperThis{
	public static void main(String args[])
	{
		B b = new B();
		b.abc();
		//B b1= new B(100);
	}
}