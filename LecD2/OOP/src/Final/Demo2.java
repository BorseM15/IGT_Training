package Final;


class Car //final cant inherited
{
	final int speed=200;
	String model="2020";
	int price = 100000;
	/* final */void gare(){
	System. out.println ("5 gares");
	}
}

class Benz extends Car
{
	void gare(){
		System. out.println ("non gares");// no one can over ride
	}
}
class Bmw extends Car
{}
	public class Demo2 {
	public static void main (String[] args) {
	Car c = new Car () ;
	System. out.println (c.speed);	
	//c.speed=2000; we cant modify
	
	Benz b = new Benz () ; 
	System.out.println("Final var of parent class: " + b.speed);
	b.gare () ;
	}

}

	// if var : we cant modify
	// if method : we cannot
	// if class : we can not


