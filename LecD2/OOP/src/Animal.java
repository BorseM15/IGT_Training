
class Prani
{
	public void makesound () {
		System. out. println ("Animal makes a Sound") ;
	}
}
class Dog extends Prani
{
	public void makesound () {
		System. out.println ("Dog barks. ..! ") ;
		}
}
class Cat extends Prani
{
	public void makesound () {
			System. out.println ("Cat Meows. . ! ") ;
			}
}
public class Animal {
	public static void main (String[] args) {

	Prani dog= new Dog() ;
	Prani cat= new Cat() ;
	Dog d= new Dog () ;
	d.makesound ();
	dog.makesound();
	cat.makesound();
	}
}
	