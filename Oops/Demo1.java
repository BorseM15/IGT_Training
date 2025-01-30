class Parent
{
	int site=5;
	int money=50000;
	String car="Benz";
}

class Child extends Parent
{
	int money=60000;
	void display(int money)
	{
		System.out.println("Site :"+site);
		System.out.println("Child Money :"+money);
		System.out.println("P Money :"+super.money);
		System.out.println("Car :"+car);
	}
}

class Demo1
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.display(8888);
	}
}