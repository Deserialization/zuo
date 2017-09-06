package cn.it.zuo;

public class InsertNumber {

	/**
	 * @param head
	 * @param num
	 * 解题步骤：
	 * @return
	 */
	public Node insertNumber(Node head, int num){
		Node node = new Node(num);
		if (head == null) {
			node.next = node;
			return node;
		}
		Node pre = head;
		Node cur = head.next;
		while(cur!=head){
			if (pre.value <= num && cur.value >= num) {
				break;
			}
			pre = cur;
			cur = cur.next;
		}
		pre.next = node;
		node.next = cur;
		return head.value < num ? head :node;
		
	}
}
