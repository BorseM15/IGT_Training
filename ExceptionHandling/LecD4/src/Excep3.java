
class A1 extends Thread{
	public void run() {
		for (int i=0; i<= 10;i++) {
			try {
			System.out.println("I :"+i);
			Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
			e.printStackTrace ();
			}
		}
	}
}

class B1 extends Thread{
	public void run () {
			for (int j=0;j<=10;j++) {
				try {
					System.out.println ("	J : "+j);
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) {
						e.printStackTrace ();
						}
			}
	}
}

class C extends Thread{
	public void run() 
	{
		for (int K=0;K<= 10;K++) {
			try {
			System.out.println ("		K : "+K);
			Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace ();
			}
		}
	}
}

public class Excep3{
		public static void main (String args[]) {
		A1 a = new A1() ;
		B1 b = new B1() ;
		C c = new C() ;
		a.start(); c.start();b.start();
		}
}