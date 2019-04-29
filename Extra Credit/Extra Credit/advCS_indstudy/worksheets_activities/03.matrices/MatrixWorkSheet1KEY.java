//A+ Computer Science - www.apluscompsci.com

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Character.*;   
import static java.lang.Double.*;

public class MatrixWorkSheet1KEY
{
	public static void main(String[] args)throws Exception
	{
		int[][] mat = {{12,1,38,94,11},
				  {13,15,19,21,33,46,51},
					{3,4,5,6,7,8}};

		out.println(mat[0][0]);				//1. ____________________

		out.println(mat[1][2]);				//2. ____________________

		out.println(mat[0][4]);				//3. ____________________

		out.println(mat[1/2][4]);			//4. ____________________

		out.println(mat[1*1][3]);			//	5. ____________________

		out.println(mat[0].length);			//	6. ____________________

		out.println(mat.length);			//	7. ____________________

		out.println(mat[1].length);		//	8. ____________________

		out.println(mat[2][0]);				//9. ____________________

		out.println(mat[2][4]);				//10. ____________________

		out.println(mat[2].length);		//	11. ____________________

		out.println(mat[1*2][5/2]);			//	12. ____________________

		out.println(mat[4][0]);
	}
}