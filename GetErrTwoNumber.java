package cn.it.zuo;

import java.util.Stack;


public class GetErrTwoNumber {

	public TreeNode[] getErrTwoNumber(TreeNode head){
		TreeNode[] nodes = new TreeNode[2];
		
		if (head == null) {
			return nodes;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pre = null;
		while(!stack.isEmpty() || head!= null){
			if (head != null) {
				stack.push(head);
				head = head.left;
			}else{
				head =stack.pop();
				if (pre!= null && pre.value > head.value) {
					nodes[0] = nodes[0] == null ? pre : nodes[0];
					nodes[1] = head;
				}
				pre = head;
				head = head.right;
			}
		}
		return nodes;
		
	}
}
