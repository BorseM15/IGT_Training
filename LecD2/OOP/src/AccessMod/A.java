package AccessMod;

public class A{
	public static void main(String args[]) {
		B b=new B();
		b.display();
	}
	public int n=100; //any where
	//private int n2=200;//only within class
	protected int n3=300;//subclass of other package + same package
	int n4=10;//same package
}

class B extends A{
	void display() {
		System.out.println("Public:" + n +" Protected:"+ n3 +" Default:"+ n4);
	}
}


