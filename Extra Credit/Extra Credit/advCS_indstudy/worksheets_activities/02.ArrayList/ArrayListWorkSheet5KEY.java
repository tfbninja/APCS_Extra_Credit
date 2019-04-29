//© A+ Computer Science  -  www.apluscompsci.com

//arraylist worksheet 5 key   

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWorkSheet5KEY
{
	public static void main(String[] args)
	{
		String s = "abcdefghijklmnop";
		ArrayList<String> r = new ArrayList<String>();
		r.add("abc");
		r.add("cde");
		r.set(1,"789");
		r.add("xyz");
		r.add("123");
		Collections.sort(r);
		r.remove(2);


		//The first index position in an array is __________.

		System.out.println( s.charAt(0) );		// LINE 2

		System.out.println( s.charAt(2) );		// LINE 3

		System.out.println( s.charAt(5) );		// LINE 4

		System.out.println( r.get(0) );			// LINE 5

		System.out.println(r.get(0).charAt(0)); 	// LINE 6

		System.out.println( r.get(2) );			// LINE 7

		System.out.println( r.indexOf("123"));	// LINE 8

		System.out.println( r.contains("abc"));	// LINE 9

		System.out.println( r.isEmpty());		// LINE 10



		r.set(1, "\\\\");
		System.out.println(r);		// LINE 11

		r.remove(1);
		System.out.println(r);		// LINE 12

		r.add("one");
		System.out.println(r);		// LINE 13

		r.add(0,"five");
		System.out.println(r);		// LINE 14

		r.clear();
		System.out.println(r);		// LINE 15
	}
}