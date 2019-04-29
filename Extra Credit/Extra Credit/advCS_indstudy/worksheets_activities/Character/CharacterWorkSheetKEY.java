//© A+ Computer Science  -  www.apluscompsci.com

//character worksheet key    

import static java.lang.Character.*;

public class CharacterWorkSheetKEY
{
	public static void main(String[] args)throws Exception
	{

		//ASCII Values - 'A' == 65  'a' == 97  '0' == 48
		char cOne = 'H';
		char cTwo = '0';
		char cThree = 'a';
		char tempOne = "abcdefghijklmnopqrstuvwxyz".charAt(0);
		char tempTwo = "01234567890".charAt(0);



		System.out.println( 'A'+ 5 );				  // LINE 1

		System.out.println( (char)('A'+ 5));			  // LINE 2

		System.out.println( '0' - 48 );				  // LINE 3

		System.out.println( '6' - 48 * 2 );			  // LINE 4

		System.out.println( Character.isUpperCase(cOne));	  // LINE 5

		System.out.println(cOne>=65&&cOne<=90);	  		// LINE 6

		System.out.println( Character.isUpperCase(cThree)); // LINE 7

		System.out.println( Character.isLowerCase(cThree)); // LINE 8

		System.out.println(cOne>=97&&cOne<=122);		  	// LINE 9

		System.out.println( Character.isDigit(cTwo));	  // LINE 10

		System.out.println( Character.isDigit(cThree));	  // LINE 11

		System.out.println(cTwo>=48&&cTwo<=57);		  	// LINE 12

		System.out.println( Character.toLowerCase(cOne));	  // LINE 13

		System.out.println( Character.toUpperCase(cThree)); // LINE 14

		System.out.println((char)(cThree-32));		 	// LINE 15

		System.out.println( Character.isLowerCase(tempOne));  // LINE 16

		System.out.println( Character.isDigit(tempTwo));	  // LINE 17

		System.out.println( Character.isLetter(tempOne));  	  // LINE 18

		System.out.println( Character.isWhitespace(tempOne)); // LINE 19

		System.out.println( Character.isWhitespace('\n'));  // LINE 20

	}
}