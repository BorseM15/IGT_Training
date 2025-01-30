import java.util.Scanner;


//Tester : slary: 30000
//developer: slary:50000
//clerk sal: 20000
class Manager
{
	Short id;
	String name;
	byte age;
	float salary= 30000f;   String des="Manager";
 
	Manager(){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Id: ");
	 id= sc.nextShort();

	System.out.print("Name: ");
	 name=sc.next();

	System.out.print("Enter age: ");
	 age= sc.nextByte();

	//System.out.print("Enter salary: ");
	// salary= sc.nextFloat();
	
	//System.out.print("Designation: ");
	 //des=sc.next();
	}
void display(){	
	System.out.println("==========================");
	System.out.println("Id:"+id );
	System.out.println("Name:"+name );
	System.out.println("Age:"+age );
	System.out.println("Salary:"+salary );
	System.out.println("Designation:"+des );

}}
class Developer{
		short id;
		String name;
		int age;
		float salary= 50000f; String des="Developer";

	Developer(){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Id: ");
	 id= sc.nextShort();

	System.out.print("Name: ");
	 name=sc.next();

	System.out.print("Enter age: ");
	 age= sc.nextByte();
	}

void display(){	
	System.out.println("==========================");
	System.out.println("Id:"+id );
	System.out.println("Name:"+name );
	System.out.println("Age:"+age );
	System.out.println("Salary:"+salary );
	System.out.println("Designation:"+des );
	}

}
class Clerk{
	short id;
	String name;
	byte age;
	float salary= 20000f;String des="Clerk";

Clerk(){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Id: ");
	 id= sc.nextShort();

	System.out.print("Name: ");
	 name=sc.next();

	System.out.print("Enter age: ");
	 age= sc.nextByte();
	}

void display(){	
	System.out.println("==========================");
	System.out.println("Id:"+id );
	System.out.println("Name:"+name );
	System.out.println("Age:"+age );
	System.out.println("Salary:"+salary );
	System.out.println("Designation:"+des );
}}

class Demo3{
public static void main(String args[]){
	Manager m = new Manager();
	m.display();
	Developer d= new Developer();
	d.display();
	Clerk c=new Clerk();
	c.display();

	
}
}	 

