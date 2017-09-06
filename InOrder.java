package cn.it.zuo;

import java.util.Stack;

/**
 * @author Administrator
 * 大体思路： 1、就是先把cur = head 压入到栈中，
 *         2、对以cur节点为头的整棵树子树来说先把左边界压入到栈中，
 *         则不停的令cur = cur.left.不断重复这个。
 *         3、然后发现cur为空，此时从栈中弹出一个节点，记为node，并打印，然后让
 * 			 cur = cur.right。然后在不断重复2
 * 		   4、直到stack为空并且cur为空，整个过程结束
 * 
 *
 */
public class InOrder {
	public void inOrder(TreeNode head){
		System.out.println("InOrder");
		if (head != null) {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			while(!stack.isEmpty() || head!= null){
				if (head != null) {
					stack.push(head);
					head = head.left;
				}else{
					head = stack.pop();
					System.out.println(head.value + " ");
					head = head.right;
				}
			}
		}
		System.out.println();
	}

}
