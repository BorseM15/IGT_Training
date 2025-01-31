
import java.util .*;

//use of throws
import java.io .*;
class File1{
	public static void main(String args[]) throws FileNotFoundException
	{
		m1();
	}
	static void m1() throws FileNotFoundException
	{
	m2();
	System.out.println("HI M1 method ...! ");
	}
	static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("HI M2 method ...! ");
	}
	static void m3() throws FileNotFoundException
	{
		File f = new File("Thanesh.txt");
		FileReader fr= new FileReader(f);
	}
}
