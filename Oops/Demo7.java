//method Overriding 
class Bank
{
	Bank(){}
	public void roi()
	{
		System.out.println("Rate of interest: 10%");
	}
}
class SBI extends Bank
	{
		//Bank(){} no becz constructor name and class name must be same: othervise behave it voilets.
	}
class Axis extends Bank{
	public void roi(){
		System.out.println("Rate of interest of Axis: 12%");
	}
}

class Demo7
{
	public static void main(String args[])
	{
		Bank b = new Bank();
		b.roi();
		Axis a= new Axis();
		a.roi();
	}
}

//same method name and same signature in child class but differnt implementation in child is method overriding.