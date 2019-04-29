//© A+ Computer Science
//www.apluscompsci.com

//boolean algregra worksheet key

import static java.lang.System.*;

public class BooleanAlgebraWorkSheetKEY
{
	public static void main(String[] args)
	{

		boolean one = true, two = false, three = false;
		
		int cnt=0, fun=0;
		
		
		out.println(one || ++cnt>0);			//	_______________________1
		out.println(one || cnt++>1);				//_______________________2
		out.println(one && cnt++>1 || three );	//	_______________________3
		out.println(fun++>0 && cnt++>1 || cnt++>1 ); 	//_______________________4
		out.println(cnt);			 		//	_______________________5
		out.println(one || ++cnt>2 && cnt++>2);		//_______________________6
		out.println(one && cnt++>2 || ++cnt>2 );	//	_______________________7
		out.println( one = false );				//_______________________8
		out.println( cnt++>5 && two == true);	//	_______________________9
		out.println(cnt++>5 | one==true & cnt++>5 ); 	//_______________________10
		out.println(!(one && two));				//_______________________11
		out.println(!(one || two));				//_______________________12
		out.println(cnt>10);				//	_______________________13
		out.println(cnt);					//	_______________________14
	}
}

