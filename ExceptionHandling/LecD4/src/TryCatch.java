import java.util.Scanner;
import java. util. InputMismatchException;

public class TryCatch {
	public static void main(String args[]){
		m1();
		System.out.println("------------------------");
		int ch;
		do {
			System.out.println("1. Do you want to repeat.");
			System.out.println("2.Exit");
			Scanner sc=new Scanner(System.in);
			 ch= sc.nextInt();
			if(ch==1)
				m3();
			if(ch == 2)
				System.out.println("Thank you....");
				System.exit(0);
		}while(ch!=3);
		System.out.println("------------------------");
		
	}
	static void m1(){
		m2();
		System.out.println("HI M1 method ...! ");
	}
	static void m2(){
		m3();
		System.out.println("HI M2 method ...! ");
	}
	static void m3(){
		try{
			System.out.println("HI M3 method ...! ");
			Scanner sc = new Scanner(System.in);
			System.out.print("ENTER A VAL : ");
			int a= sc.nextInt();
			System.out.print("Enter B val : ");
			int b= sc.nextInt();
			int c = a/b;
			System.out.println("Result is :"+c);
			}
		catch(InputMismatchException ime){
			System.out.println("Boss please enter NUMBER onmly");
		}
		catch(ArithmeticException ae){
			System.out.println("We cant devide anything by ZERO ...! ");
		}
		catch(Exception e){
			System.out.println(e);}
		
		finally{ System.out.println("Thank you ...! ");}
	}
	
	
}