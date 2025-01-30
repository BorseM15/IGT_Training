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

}
	void raiseSalary(){
		salary= salary+4000;
		System.out.println("Salary: "+ salary+"\n");
}
}
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
	void raiseSalary(){
		salary= salary+3000;
		System.out.println("Salary: "+ salary+"\n");
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
}
	void raiseSalary(){
		salary= salary+10000;
		System.out.println("Salary: "+ salary+"\n");
}
}

class Demo4{
public static void main(String args[]){
	Manager m=null;
	Developer d= null;
	Clerk c =null;
	

	Scanner sc= new Scanner(System.in);
	int ch1,ch2=0;
	do{
		System.out.println("1. Create");
		System.out.println("2. Display");
		System.out.println("3. Raise salary");
		System.out.println("4. Exit");
		ch1 =sc.nextInt();
		if(ch1 == 1){
				do{
					System.out.println("	1. Manager");
					System.out.println("	2. Developer");
					System.out.println("	3. Clerk");
					System.out.println("	4. Exit");

					ch2=sc.nextInt();
					if(ch2 == 1){ m = new Manager();}
					if(ch2 == 2){ d= new Developer();}
					if(ch2 == 3){ c=new Clerk();}
					
				  }while(ch2 != 4);
				}
		if(ch1 == 2){
				do{
					System.out.println("	1. Manager");
					System.out.println("	2. Developer");
					System.out.println("	3. Clerk");
					System.out.println("	4. Exit");
					ch2=sc.nextInt();
					if(ch2 == 1){ m.display();}
					if(ch2 == 2){ d.display();}
					if(ch2 == 3){c.display();}
					
				  }while(ch2 != 4);
			}
		if(ch1 == 3){
				do{
					System.out.println("	1. Manager");
					System.out.println("	2. Developer");
					System.out.println("	3. Clerk");
					System.out.println("	4. Exit");
					ch2=sc.nextInt();
					if(ch2 == 1){  m.raiseSalary();}
					if(ch2 == 2){  d.raiseSalary();}
					if(ch2 == 3){c.raiseSalary();}
					}while(ch2 != 4);

				}
		if(ch1 == 4){
			 	System.out.println("Thank you...!");
				System.exit(0);
			}
	   }while(ch1 != 5);
	
}
}	 

