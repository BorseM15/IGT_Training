package Project;

//Differnce between class, abstract class, interface
class A
{
	int a;//0
	A() {}
	void abc() { }
	//abstract void xyz(); //cant create abstract methos in normal class
}

class A1{}

//class A2 extends A1,A{} //cant use multiple inheritance
abstract class B
{
	int b;//0
	void abc() { }
	abstract void xyz () ;
}
// not in abstract class also
interface I
{
	public static final int i=100;
	//int s; //cant create normal var
	
	void aaa ();
	public abstract void xyz () ;
	default void display() {
		System.out.println("default method..");
	}
}

interface J {}
class K implements I , J{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
	
}

public class P2{
	public static void main (String[] args)
	{
		A a = new A() ;
		System. out.println (a.a);
		K k = new K();
		k.display();
		//B b = new B(); //we cant create object of interface and abstract class
		//I i = new I();
	}
}