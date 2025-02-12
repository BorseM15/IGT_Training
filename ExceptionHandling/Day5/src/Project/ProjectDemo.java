package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Emp{
	int id; int age; int salary;
	String name; String desig;
	Scanner sc = new Scanner (System. in) ;
	Emp (){
		System. out.print ("ID : ") ; id=sc.nextInt ();
		System. out.print("Name: ") ; name= sc.next ();
		System. out.print("Age: ") ; age=sc.nextInt ();
	}
	void display () {
		System. out.println ("******");
		System. out.println ("My Name is: " + name) ;
		System. out.println ("My ID: " + id) ;
		System. out.println ("My salary: " + salary) ;
		System. out.println ("My Age: " + age) ;
		System. out.println ("My Designation is: " + desig) ;
		System. out.println ("******");

	}
}

class Clerk extends Emp{
	public Clerk () {
		salary=30000;
		desig="Clerk";
	}
}
class Developer extends Emp{
	public Developer () {
		salary=50000;
		desig="Developer";
		}
}
public class ProjectDemo {
	public static void main(String args[]) {
	
		ArrayList<Emp> obj = new ArrayList<Emp>();
		
		Scanner sc= new Scanner(System.in);
		int ch1,ch2=0;
		do{
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			System.out.print("Enter ur choice: ");
			ch1 = sc.nextInt();
			if(ch1 == 1){
					do{
						System.out.println("	1. Developer");
						System.out.println("	2. Clerk");
						System.out.println("	3. Exit");
						System.out.print("Enter ur choice: ");
						ch2=sc.nextInt();
						if(ch2 == 1){ obj.add(new Developer());}
						if(ch2 == 2){ obj.add(new Clerk());}
						
					  }while(ch2 != 3);
					}
			if(ch1 == 2){
						Iterator i =obj.iterator ();
						while (i.hasNext()) {
						Emp e= (Emp)i.next();
							e.display();
						}
				
				}
			if(ch1 == 3){
				 	System.out.println("Thank you...!");
					System.exit(0);
				}
		   }while(ch1 != 3);

	
	}
}
