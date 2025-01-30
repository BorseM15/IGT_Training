package Project;


//Concept of static & default method. after java 8 it came. 
interface Bank
{
	void OT();
	void atm() ;
	void withdraw();
	default void zeroAcc() {
	// 100 lines of logic
		}
	
	static void xyz () {
	// 100 lines of logic
	}
}

class Sbi implements Bank
{
	public void OT () {}
	public void atm() {}
	public void withdraw() {}
}
class Icici implements Bank
{
	public void OT () {}
	public void atm() {}
	public void withdraw () {}
}

class Indian implements Bank
{
	public void OT () {}
	public void atm() { }
	public void withdraw () {}
}
public class P3 {
	public static void main (String[] args) {
	Sbi s= new Sbi () ; s.atm() ; s.OT () ;s.withdraw () ;s.zeroAcc () ;
	Icici i= new Icici() ; i.atm() ; i.OT () ; i.withdraw() ; i.zeroAcc ();
	//i.xyz ();
	Bank.xyz();// hence its a static method
	}
}