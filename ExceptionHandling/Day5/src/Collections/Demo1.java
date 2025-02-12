package Collections;

import java.util.Scanner;

public class Demo1{
	public static void main (String[] args) {
		int a[]= {1,2, 5, 6, 8, 3, 6};
			for(int i=0;i<a.length; i++) {
				System. out.println ("A :"+i);
			}
		System. out.println (" ===== For EachLoop ========== ");
			for ( int x :a)
			{
				System. out.println ("X :" +x);
			}
		int ar[]= new int [5];
		ar [0]=000;
		ar[1]=111;
		ar [2]=222;
		ar [3]=333;
		ar[4]=444;
		System. out.println (" ========= ");
			for (int i=0;i<ar.length; i++)
			{
				System. out.println ("Ar :"+ar[i]);
			}
		System. out.println (" ===== For EachLoop ========== ") ;
			for ( int x1 :ar)
			{
				System. out.println ("X1 :" +x1);
			}
		System. out.println (" =============== ");
		Scanner sc = new Scanner (System. in) ;
		System. out.println ("Enter size of array: ") ; 
		int size= sc.nextInt () ;
		System.out.println("Enter the " + size + "elements: ");
		int arr[]= new int [size];
			for (int i=0;i<size; i++) {
				arr[i]=sc.nextInt ();
			}
		System. out.println (" ----- ");
			for ( int T:arr) {
				System. out.println ("T :"+T);}
}
}
