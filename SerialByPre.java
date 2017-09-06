package cn.it.zuo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Administrator
 * offer(E e) 
          将指定的元素插入此队列（如果立即可行且不会违反容量限制），
          当使用有容量限制的队列时，此方法通常要优于 add(E)，
          后者可能无法插入元素，而只是抛出一个异常
 *
 */
public class SerialByPre {
	public String serialByPre(TreeNode head){
		if (head == null) {
			return "#!";
		}
		String res = head.value + "!";
		res += serialByPre(head.left);
		res += serialByPre(head.right);
		return res;
	}
	public TreeNode reconByPreString(String perStr){
		String[] value = perStr.split("!");
		Queue<String> queue = new LinkedList<String>();
		for (int i = 0; i != value.length; i++) {
			queue.offer(value[i]);
		}
		return reconPreOrder(queue);
		
	}
	private TreeNode reconPreOrder(Queue<String> queue) {
		// TODO Auto-generated method stub
		String value = queue.poll();
		if (value.equals("#")) {
			return null;
		}
		TreeNode head = new TreeNode(Integer.valueOf(value));
		head.left =reconPreOrder(queue);
		head.right = reconPreOrder(queue);
		return head;
	}
	

}
