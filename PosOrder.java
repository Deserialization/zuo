package cn.it.zuo;

import java.util.Stack;

/**
 * @author Administrator
 * 解题：1就是先申请一个栈记为s1，然后将头结点head压入到s1中，
 * 2、从s1中弹出一个节点记为cur，然后依次将cur的左孩子和有孩子压入到s1中，
 * 3、在整个过程中，每一个从s1弹出的节点都放进了s2中，
 * 4、不断重复步骤2、3,知道s1为空，过程停止
 * 5、从s2中依次弹出节点并打印，打印的顺序就是后续遍历的顺序。
 * 
 *
 */
public class PosOrder {
	public void posOrder(TreeNode head){
		if (head!= null) {
			Stack<TreeNode> stack1= new Stack<TreeNode>();
			Stack<TreeNode> stack2= new Stack<TreeNode>();
			stack1.push(head);
			while(! stack1.isEmpty()){
				head = stack1.pop();//把头节点从stack1先弹出来
				stack2.push(head);//把头节点压入stack2
				if (head.left != null) {
					stack1.push(head.left);
				}
				if (head.right != null) {
					stack1.push(head.right);
				}
			}
			while(!stack2.isEmpty()){
				System.out.println(stack2.pop().value + " ");
			}
		}
		System.out.println();
	}

}
