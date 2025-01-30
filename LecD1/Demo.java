import java.util.Scanner;

class Demo
{
 public static void main(String args[]){

  Scanner sc = new Scanner(System.in);

	System.out.print("Enter Id: ");
	int id= sc.nextInt();

	System.out.print("Name: ");
	String name=sc.next();

	System.out.print("Enter age: ");
	int age= sc.nextInt();

	System.out.print("Enter salary: ");
	float salary= sc.nextFloat();
	
	System.out.print("Designation: ");
	String des=sc.next();

	System.out.println("Id:"+id );
	System.out.println("Name:"+name );
	System.out.println("Age:"+age );
	System.out.println("Salary:"+salary );
	System.out.println("Designation:"+des );


	 
}
}
