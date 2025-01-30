package Bank;

//force you to override method
abstract class A{
	abstract void abs();
	abstract void xyz();
	abstract void OT();
}
abstract class B extends A{

	//i made this class as abstract now there no need to override the methods 
	
}
class C extends B{
	void atoz() {
	}
	void OT() {
	}
	@Override
	void abs() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void xyz() {
		// TODO Auto-generated method stub
		
	}
}
public class Demo1 {
	public static void main(String args[]) {
		C c=new C();
		c.abs();
		c.xyz();
		c.atoz();
	}

}
