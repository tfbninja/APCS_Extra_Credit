//© A+ Computer Science
//www.apluscompsci.com

//TreeWorkSheet 4 KEY

import static java.lang.System.*;

class TreeFunHouse
{
   public static TreeNode getSmallest(TreeNode t)
   {
   	while(t!=null&&t.getLeft()!=null)
   	{
   		t=t.getLeft();
   	}
  	   return t;
   }

   public static TreeNode getLargest(TreeNode t)
   {
    	while(t!=null&&t.getRight()!=null)
   	{
   		t=t.getRight();
   	}
  	   return t;
   }
}

public class TreeWorkSheet4KEY
{
   public static void main( String args[] )
   {
		TreeNode node = new TreeNode(10,
					new TreeNode(5, new TreeNode(2,null,null),null),
					new TreeNode(15, null,new TreeNode(20,null,null)));
					
		out.println(TreeFunHouse.getSmallest(node));
		out.println(TreeFunHouse.getSmallest(node).getValue());
		
		out.println(TreeFunHouse.getLargest(node));
		out.println(TreeFunHouse.getLargest(node).getValue());				
   }
}