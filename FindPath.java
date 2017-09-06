package cn.it.zuo;

import java.util.HashMap;

public class FindPath {

	public int getMaxLength(TreeNode head, int sum) {
		
		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		sumMap.put(0, 0);
		return PreOrder(head, sum, 0, 1, 0, sumMap);
	}

	private int PreOrder(TreeNode head, int sum, int presum, int level, int maxlen, HashMap<Integer, Integer> sumMap) {
		// TODO Auto-generated method stub
		if (head == null) {
			return maxlen;
		}
		int curSum = presum + head.value;
		if (!sumMap.containsKey(curSum)) {
			sumMap.put(curSum, level);
		}
		if (sumMap.containsKey(curSum - sum)) {
			maxlen = Math.max(level- sumMap.get(curSum-sum),maxlen);
			
		}
		maxlen = PreOrder(head.left, sum,curSum, level + 1, maxlen, sumMap);
		maxlen = PreOrder(head.right, sum,curSum, level + 1, maxlen, sumMap);
		if (level == sumMap.get(curSum)) {
			sumMap.remove(curSum);
		}
		return maxlen;
		
	}
}
