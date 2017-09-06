package cn.it.zuo;
public class Contains {
	public boolean contains(TreeNode t1, TreeNode t2) {
		return check(t1,t2) || contains(t1.left, t2) || contains(t1.right, t2);
		
	}

	private boolean check(TreeNode h, TreeNode t2) {
		// TODO Auto-generated method stub
		if (t2 == null) {
			return true;
		}
		if (h == null || h.value != t2.value) {
			return false;
		}
		
		return check(h.left, t2.left) && check(h.right, t2.right);
	}

}
