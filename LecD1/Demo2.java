import java.util.Scanner;

class A
{
	int id;String name;int age;float salary;String des;
 
	A(){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Id: ");
	 id= sc.nextInt();

	System.out.print("Name: ");
	 name=sc.next();

	System.out.print("Enter age: ");
	 age= sc.nextInt();

	System.out.print("Enter salary: ");
	 salary= sc.nextFloat();
	
	System.out.print("Designation: ");
	 des=sc.next();
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
class Demo2{
public static void main(String args[]){
	A a = new A();
	a.display();
	
}
}	 

