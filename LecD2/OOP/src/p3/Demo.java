package p3;

class A
{
	static int x=10000;
//	static A() { }  //constructor cant be static becz its object oriented
	static void display ()
	{
		System. out.println ("Hiiiiiii");
	}
	public static void main (String args)
	{
		System. out.println ("Ml "+args);
	}
}

public class Demo{
	public static void main (String [] args) {
	//A a = new A() ; a.display () ;
	//System. out.println (a.x);
	// static : without createing obj we csmn run :
	// static doiint not belongs to obj
	// all the static related thing will storedin static memory
	// all the non static (instace) : it will store in instance mem
	A.display();
	A.main ("Monali");
	System. out.println (A.x);
	}
}