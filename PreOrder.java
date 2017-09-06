package cn.it.zuo;

import java.util.Stack;

public class PreOrder {
	public void preOrder(TreeNode head){
		System.out.println("Pre:");
		if (head != null) {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			while(! stack.isEmpty()){
				head = stack.pop();
				System.out.println(head.value);
				if (head.right != null) {
					stack.push(head.right);
				}
				if (head.left !=null) {
					stack.push(head.left);
				}
			}
		}
		System.out.println();
	}

}
