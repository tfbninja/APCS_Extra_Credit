//© A+ Computer Science
//www.apluscompsci.com

//iterator worksheet key

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorWorkSheetKEY
{
   public static void main(String args[])
   {
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(11);
		x.add(9);
		Iterator<Integer> it = x.iterator();
		System.out.println(it.next());
		System.out.println(it.next());



		out.println("\n\n");

		ArrayList<Integer> w = new ArrayList<Integer>();
		w.add(4);
		w.add(6);
		w.add(8);		
		Iterator<Integer> iter = w.iterator();
		while(iter.hasNext()){
		   System.out.println(iter.next());
		   iter.remove();
		}
		System.out.println(w);



		out.println("\n\n");



		ArrayList<Integer> z;
		z = new ArrayList<Integer>();
		z.add(3);
		z.add(7);
		z.add(3);
		z.add(7);
		z.add(9);
		z.add(5);
		System.out.println(z);
		Iterator<Integer> itera = z.iterator();
		while(itera.hasNext()){
		   if(itera.next().compareTo(7)==0)
		     itera.remove();
		}
		System.out.println(z);



		out.println("\n\n");


		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(9);
		a.add(7);
		a.add(2);
		ListIterator<Integer> iterator = a.listIterator();
		iterator.next();
		iterator.set(1);
		iterator.next();
		iterator.set(4);		
		iterator.previous();
		iterator.remove();		
		iterator.previous();
		iterator.set(0);
		System.out.println(a);
   }
}
