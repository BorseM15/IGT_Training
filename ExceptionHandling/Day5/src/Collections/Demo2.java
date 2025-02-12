package Collections;

import java.util .*;

//import Project.Clerk;
class Clerk
{
	Clerk(){
		System.out.println("Contructor of clerk class");
	}
	String name; int id;
	Clerk(String name, int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Clerk [name=" + name + ", id=" + id + "]";
	}
	
}
public class Demo2 {
	public static void main (String[] args) {
//	List 1 = new List () ;// List is interface. we cant create a obj
	ArrayList al = new ArrayList() ;
		al.add(122);
		al.add(45.67);
		al.add ("Monali"); //String
		al.add (true);
		al.add ('A');
		al.add(74);
		al.add (new Date ()); //date obj
		al.add(new Clerk("Mnasi",12));
		al.add(new Clerk("Kavita", 13));
		Clerk cl=new Clerk();
		
		al.add(cl); //class obj
		al.add(67);
	System. out.println (al); //print List[]
	System. out. println ("---------");
	
	for(int i=0;i<al.size();i++) {
	System. out.println (al.get(i)); //print list using loop
	}
	
	System. out. println ("==========ITERATOR======== ") ;
	Iterator i =al.iterator (); //use for integration of collection
	// forward direction
	// reverse direction
	// delete the record while iterating
	// add
	while (i.hasNext ()) {
	System. out.println(i.next());//112, 34,234,Monali
	}

	}

}