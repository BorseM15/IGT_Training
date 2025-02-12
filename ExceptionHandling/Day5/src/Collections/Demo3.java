package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java. util.HashSet;
import java.util. Iterator;
import java.util.LinkedHashMap;
import java. util. LinkedHashSet;
import java. util. LinkedList;
import java.util.List;
import java.util. TreeSet;



public class Demo3 {
	public static void main (String[] args) {
		//	List al = new List<>();// interface
//			ArrayList al = new ArrayList<> (); // best to serach operation// duplicate are alowd
//			LinkedList al = new LinkedList<> (); // best for insert and delete //follow order
//		
//			
//		//Legecy class : old class : 1995 : in this we have less methdks
//		//Vector al = new Vector ();
//		//Stack al = new Stack();
//		
//		//Set s= new Set ();
//		//HashSet al = new HashSet ();// no dup + no order
//		//LinkedHashSet al = new LinkedHashSet () ; // no dup + user entered order
//		//TreeSet al = new TreeSet (); //no dup + sorted order
//		al.add(100);
//		al.add(345);
//		al.add(234);
//		al.add(5656);
//		al.add(76);
//		al.add(97);
//		al.add(100);
//		al.add(12);
//		al.add(345);
//		System. out.println ("======ITERATOR ===========");
//		Iterator i =al.iterator ();
//		while(i.hasNext ()) {
//			System. out.println(i.next ());//112,34,234,Thanesh
//		}
		
//		HashMap map = new HashMap () ;// no dup + randorm order
		LinkedHashMap map = new LinkedHashMap () ;
		//TreeMap map = new TreeMap (); // home genius data should be//if we add heterogeneous data give error
		map.put (111, "Abi");
		map.put (456, "Harsih") ;
		map.put (453, "Manish") ;
		map.put (789, "Ganesh") ;
		map.put (111, "Thanesh");
		map.put ("ABC", "ISHA") ;
		map.put ("XYZ", "ISHA") ;
		map.put ("ATOZ", "ISHA") ;
		map.put ("AAA", "ISHA") ;
		map.put ("BBB", "ISHA") ;
		Set s = map.entrySet () ; //
		Iterator il = s.iterator () ;
		while (il.hasNext ()) {
		System. out.println(il.next ());
	}
	

}