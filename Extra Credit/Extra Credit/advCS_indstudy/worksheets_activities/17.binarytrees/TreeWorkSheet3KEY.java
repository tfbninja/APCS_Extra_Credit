//© A+ Computer Science
//www.apluscompsci.com

//TreeWorkSheet 3 KEY

import static java.lang.System.*;

class TreeFunHouse
{
   public static int countNodes(TreeNode t)
   {
   	if(t!=null)
   	{
   	  return 1 + countNodes(t.getLeft())+countNodes(t.getRight());	
   	}
   	return 0;
   }
}

public class TreeWorkSheet3KEY
{
   public static void main( String args[] )
   {
		out.println("quest 1");
		TreeNode x = new TreeNode(34,
					new TreeNode(57, null,null),
					new TreeNode(13, null,null));
		
		
		out.println(x.getValue());
		out.println(x.getLeft().getValue());
		out.println(x.getRight().getValue()+"\n\n\n\n");


		out.println("\n\nquest 21");		
		TreeNode y = new TreeNode("50",
			new TreeNode("25", 
		            new TreeNode("15", null,null),
		            new TreeNode("35", null,null)),
			new TreeNode("70", null,null));
			
				
		out.println(y.getValue());
		out.println(y.getLeft().getValue());
		out.println(y.getRight().getValue());
		out.println(y.getLeft().getRight().getValue());
		out.println(y.getRight().getLeft());

		
		out.println("\n\n"+TreeFunHouse.countNodes(x));		
		
				
   }
}