package Bank;

class Sbi extends Bank1{
	@Override
	void ATM(){
		// TODO Auto-generated method stub
		System.out.println("SBI: Master Card");
	}

	@Override
	void FD() {
		// TODO Auto-generated method stub
		System.out.println("20%");

	}

	@Override
	void OT() {
		// TODO Auto-generated method stub
		
	}	
}
class Hdfc extends Bank1{
	@Override
	void ATM() {
		// TODO Auto-generated method stub
		System.out.println("HDFC: Platinum Card");

	}
	@Override
	void FD() {
		// TODO Auto-generated method stub
		System.out.println("7%");

	}
	@Override
	void OT() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Demo2 {
	public static void main(String args[]) {
	Sbi s=new Sbi();
	s.ATM();
	s.FD();
	Hdfc h = new Hdfc();
	h.ATM();
	h.FD();
	}
}
